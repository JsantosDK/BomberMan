package ciffar.views;

import ciffar.graphics.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class WorldView implements View {

    private final int worldWidth = (int) (Assets.GAME_WIDTH / Assets.SPRITE_WIDTH);
    private final int worldHeight = (int) (Assets.GAME_HEIGHT / Assets.SPRITE_HEIGHT);
    private Graphics graphics;
    private BufferedImage[][] background;

    public WorldView() {
        background = new BufferedImage[worldHeight][worldWidth];
        createBackgroundGrid();
    }

    public void init() {
        generateBackground();
    }

    private void createBackgroundGrid(){
        for (int i = 0; i < worldHeight; i++) {
            for (int j = 0; j < worldWidth; j++) {
                if (i == 0 && j == 0) {
                    background[i][j] = Assets.wallTopLeft;
                    continue;
                }
                if (i == worldHeight - 1 && j == 0) {
                    background[i][j] = Assets.wallBottomLeft;
                    continue;
                }
                if (i == worldHeight - 1 && j == worldWidth - 1) {
                    background[i][j] = Assets.wallBottomRight;
                    continue;
                }
                if (i == 0 && j == worldWidth - 1) {
                    background[i][j] = Assets.wallTopRight;
                    continue;
                }
                if (i == 0) {
                    background[i][j] = Assets.wallTop;
                    continue;
                }
                if (i == worldHeight - 1) {
                    background[i][j] = Assets.wallBottom;
                    continue;
                }
                if (j == 0) {
                    background[i][j] = Assets.wallLeft;
                    continue;
                }
                if (j == worldWidth - 1) {
                    background[i][j] = Assets.wallRight;
                    continue;
                }
                background[i][j] = Assets.interior[(int) (Math.random() * 4)];

            }
        }
    }

    private void generateBackground() {
        for (int i = 0; i < worldHeight; i++) {
            for (int j = 0; j < worldWidth; j++) {
                graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
                /*
                if (i == 0 && j == 0) {
                    graphics.drawImage(background[i][j], 0, 0, null);
                    continue;
                }
                if (i == worldHeight - 1 && j == 0) {
                    graphics.drawImage(background[i][j], 0, i * Assets.SPRITE_HEIGHT, null);
                    continue;
                }
                if (i == worldHeight - 1 && j == worldWidth - 1) {
                    graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
                    continue;
                }
                if (i == 0 && j == worldWidth - 1) {
                    graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, 0, null);
                    continue;
                }
                if (i == 0) {
                    graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, 0, null);
                    continue;
                }
                if (i == worldHeight - 1) {
                    graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
                    continue;
                }
                if (j == 0) {
                    graphics.drawImage(background[i][j], 0, i * Assets.SPRITE_HEIGHT, null);
                    continue;
                }
                if (j == worldWidth - 1) {
                    graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
                    continue;
                }
                graphics.drawImage(background[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);

                 */
            }
        }
    }


    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}
