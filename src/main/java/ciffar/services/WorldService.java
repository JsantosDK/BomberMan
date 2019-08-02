package ciffar.services;

import ciffar.confi.EntityManager;
import ciffar.controllers.entities.objects.PilarController;
import ciffar.graphics.Assets;
import ciffar.models.tiles.FloorTile;
import ciffar.models.tiles.ObstacleTile;
import ciffar.models.tiles.Tile;

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

                if ( i%2 != 0 && j%2 == 0 && (i < worldHeight - 2 && j < worldWidth - 2 ) ){
                    PilarController pilarController = new PilarController( j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, entityManager.getGraphics());
                    entityManager.addEntity(pilarController, pilarController.getPilarService());
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
}
