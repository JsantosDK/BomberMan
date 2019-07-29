package ciffar.services;

import ciffar.graphics.Assets;

import java.awt.image.BufferedImage;

public class WorldService {

    private int worldWidth;
    private int worldHeight;
    private BufferedImage[][] worldGrid;

    public WorldService() {
        worldWidth = Assets.GAME_WIDTH / Assets.SPRITE_WIDTH;
        worldHeight = Assets.GAME_HEIGHT / Assets.SPRITE_HEIGHT;
        worldGrid = new BufferedImage[worldHeight][worldWidth];
    }

    public void init(){
        generateGrid();
    }

    private void generateGrid(){
        for (int i = 0; i < worldHeight; i++){
            for (int j = 0; j < worldWidth; j++){
                if (i == 0 && j == 0) {
                    worldGrid[i][j] = Assets.wallTopLeft;
                    continue;
                }
                if (i == worldHeight - 1 && j == 0) {
                    worldGrid[i][j] = Assets.wallBottomLeft;
                    continue;
                }
                if (i == worldHeight - 1 && j == worldWidth - 1) {
                    worldGrid[i][j] = Assets.wallBottomRight;
                    continue;
                }
                if (i == 0 && j == worldWidth - 1) {
                    worldGrid[i][j] = Assets.wallTopRight;
                    continue;
                }
                if (i == 0) {
                    worldGrid[i][j] = Assets.wallTop;
                    continue;
                }
                if (i == worldHeight - 1) {
                    worldGrid[i][j] = Assets.wallBottom;
                    continue;
                }
                if (j == 0) {
                    worldGrid[i][j] = Assets.wallLeft;
                    continue;
                }
                if (j == worldWidth - 1) {
                    worldGrid[i][j] = Assets.wallRight;
                    continue;
                }
                worldGrid[i][j] = Assets.interior[(int) (Math.random() * 4)];
            }
        }
    }

    public BufferedImage[][] getWorldGrid() {
        return worldGrid;
    }

    public int getWorldWidth() {
        return worldWidth;
    }

    public int getWorldHeight() {
        return worldHeight;
    }
}
