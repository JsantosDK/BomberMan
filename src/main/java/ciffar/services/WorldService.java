package ciffar.services;

import ciffar.controllers.entities.creatures.EnemyController;
import ciffar.controllers.entities.objects.BoxController;
import ciffar.factories.EntityFactory;
import ciffar.factories.ObjectTypes;
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
    private EntityFactory entityFactory;

    public WorldService() {
        worldWidth = Assets.GAME_WIDTH / Assets.SPRITE_WIDTH;
        worldHeight = Assets.GAME_HEIGHT / Assets.SPRITE_HEIGHT;
        worldGrid = new Tile[worldHeight][worldWidth];
    }

    public void init(){
        generateGrid();
        entityFactory.createObject(ObjectTypes.PLAYER, Assets.SPRITE_WIDTH, Assets.SPRITE_HEIGHT);
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
                        entityFactory.createObject(ObjectTypes.BOX, j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT);
                    } else if (Math.random() < 0.1){
                        entityFactory.createObject(ObjectTypes.ENEMY,j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT);
                    }
                } else if ( i%2 == 0 && j%2 == 0 && (i < worldHeight - 2 && j < worldWidth - 2 ) ) {
                    entityFactory.createObject(ObjectTypes.PILLAR, j * Assets.SPRITE_WIDTH, (i - 1) * Assets.SPRITE_HEIGHT );
                }
            }
        }
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

    public void setEntityFactory(EntityFactory entityFactory) {
        this.entityFactory = entityFactory;
    }
}
