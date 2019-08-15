package ciffar.services;

import ciffar.controllers.entities.creatures.EnemyController;
import ciffar.controllers.entities.objects.BoxController;
import ciffar.models.EntityManager;
import ciffar.controllers.entities.objects.PillarController;
import ciffar.graphics.Assets;
import ciffar.models.tiles.FloorTile;
import ciffar.models.tiles.ObstacleTile;
import ciffar.models.tiles.Tile;
import ciffar.services.entities.creatures.EnemyService;
import ciffar.services.entities.objects.BoxService;
import ciffar.services.entities.objects.PillarService;
import ciffar.views.entities.creatures.EnemyView;
import ciffar.views.entities.objects.BoxView;
import ciffar.views.entities.objects.PillarView;

public class WorldService {

    private int worldWidth;
    private int worldHeight;
    private Tile[][] worldGrid;
    private EntityManager entityManager;

    public WorldService() {
        worldWidth = Assets.GAME_WIDTH / Assets.SPRITE_WIDTH;
        worldHeight = Assets.GAME_HEIGHT / Assets.SPRITE_HEIGHT;
        worldGrid = new Tile[worldHeight][worldWidth];
    }

    public void init(){
        generateGrid();
    }

    private void generateGrid(){
        for (int i = 0; i < worldHeight; i++){
            for (int j = 0; j < worldWidth; j++){
                if (i == 0 && j == 0) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallTopLeft);
                    continue;
                }
                if (i == worldHeight - 1 && j == 0) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallBottomLeft);
                    continue;
                }
                if (i == worldHeight - 1 && j == worldWidth - 1) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallBottomRight);
                    continue;
                }
                if (i == 0 && j == worldWidth - 1) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallTopRight);
                    continue;
                }
                if (i == 0) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallTop);
                    continue;
                }
                if (i == worldHeight - 1) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallBottom);
                    continue;
                }
                if (j == 0) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallLeft);
                    continue;
                }
                if (j == worldWidth - 1) {
                    worldGrid[i][j] = new ObstacleTile(Assets.wallRight);
                    continue;
                }
                worldGrid[i][j] = new FloorTile(Assets.interior[(int) (Math.random() * 4)]);

                if ( ((i < 2 && j > 2) || (i > 2 && j < 2)) || ((i >= 2 && j >= 2) && !(i%2 == 0 && j%2==0))){
                    if (Math.random() < 0.3) {
                        createBoxObject(j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT);
                    } else if (Math.random() < 0.1){
                        createEnemyObject(j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT);
                    }
                } else if ( i%2 == 0 && j%2 == 0 && (i < worldHeight - 2 && j < worldWidth - 2 ) ) {
                    createPillarObject(j * Assets.SPRITE_WIDTH, (i - 1) * Assets.SPRITE_HEIGHT );
                }
            }
        }
        //createEnemyObject(Assets.SPRITE_WIDTH,2 * Assets.SPRITE_HEIGHT);
    }

    private void createBoxObject(int x, int y){
        BoxController boxController = new BoxController();
        BoxService boxService = new BoxService(x,y);
        BoxView boxView = new BoxView();

        boxController.setBoxService(boxService);
        boxController.setBoxView(boxView);
        boxView.setGraphics(entityManager.getGraphics());
        boxView.setBoxService(boxService);

        entityManager.addEntity(boxController,boxService);
    }

    private void createPillarObject(int x, int y){
        PillarController pillarController = new PillarController();
        PillarService pillarService = new PillarService(x,y);
        PillarView pillarView = new PillarView();

        pillarController.setPillarService(pillarService);
        pillarController.setPillarView(pillarView);
        pillarView.setGraphics(entityManager.getGraphics());
        pillarView.setPillarService(pillarService);

        entityManager.addEntity(pillarController, pillarService);
    }

    private void createEnemyObject(int x, int y){
        EnemyController enemyController = new EnemyController();
        EnemyService enemyService = new EnemyService(x,y);
        EnemyView enemyView = new EnemyView();

        enemyController.setEnemyService(enemyService);
        enemyController.setView(enemyView);
        enemyService.setWorldService(this);
        enemyView.setGraphics(entityManager.getGraphics());
        enemyView.setCreatureController(enemyController);
        enemyView.setCreatureService(enemyService);

        entityManager.addEntity(enemyController, enemyService);
    }

    public Tile[][] getWorldGrid() {
        return worldGrid;
    }

    public int getWorldWidth() {
        return worldWidth;
    }

    public int getWorldHeight() {
        return worldHeight;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
