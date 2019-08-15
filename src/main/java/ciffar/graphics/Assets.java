package ciffar.graphics;

import ciffar.loaders.ImageLoader;

import java.awt.image.BufferedImage;

public class Assets {

    public final static int SPRITE_WIDTH = 25;
    public final static int SPRITE_HEIGHT = 25;
    public final static int GAME_WIDTH = 775;
    public final static int GAME_HEIGHT = 425;
    public final static String GAME_TITLE ="My Bomberman";
    private final BufferedImage sheet = ImageLoader.loadImage("/SpriteSheet.png");

    public static BufferedImage[] playerDown;
    public static BufferedImage[] playerUp;
    public static BufferedImage[] playerLeft;
    public static BufferedImage[] playerRight;
    public static BufferedImage wallBottomLeft;
    public static BufferedImage wallBottomRight;
    public static BufferedImage wallTopLeft;
    public static BufferedImage wallTopRight;
    public static BufferedImage wallBottom;
    public static BufferedImage wallTop;
    public static BufferedImage wallLeft;
    public static BufferedImage wallRight;
    public static BufferedImage[] interior;
    public static BufferedImage pillar;
    public static BufferedImage box;
    public static BufferedImage[] enemyDown;
    public static BufferedImage[] enemyUp;
    public static BufferedImage[] enemyLeft;
    public static BufferedImage[] enemyRight;
    public static BufferedImage[] bomb;

    private  BufferedImage cropImage(int x, int y, int width, int height) {
        return sheet.getSubimage(x, y, width, height);
    }

    public void init() {
        playerDown = new BufferedImage[3];
        playerDown[0] = cropImage(0 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown[1] = cropImage(0 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown[2] = cropImage(0 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp = new BufferedImage[3];
        playerUp[0] = cropImage(1 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp[1] = cropImage(1 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp[2] = cropImage(1 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft = new BufferedImage[3];
        playerLeft[0] = cropImage(2 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft[1] = cropImage(2 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft[2] = cropImage(2 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight = new BufferedImage[3];
        playerRight[0] = cropImage(3 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight[1] = cropImage(3 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight[2] = cropImage(3 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        wallBottomLeft = cropImage(0 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottomRight = cropImage(1 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopLeft = cropImage(2 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopRight = cropImage(3 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottom = cropImage(1 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTop = cropImage(0 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallLeft = cropImage(2 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallRight = cropImage(3 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        interior = new BufferedImage[4];
        interior[0] = cropImage(0 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[1] = cropImage(1 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[2] = cropImage(2 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[3] = cropImage(3 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        pillar = cropImage(0 * SPRITE_WIDTH, 6 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT * 2);

        box = cropImage(1 * SPRITE_WIDTH, 7 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        enemyDown = new BufferedImage[3];
        enemyDown[0] = cropImage(0 * SPRITE_WIDTH, 8 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyDown[1] = cropImage(0 * SPRITE_WIDTH, 9 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyDown[2] = cropImage(0 * SPRITE_WIDTH, 10 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyUp = new BufferedImage[3];
        enemyUp[0] = cropImage(1 * SPRITE_WIDTH, 8 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyUp[1] = cropImage(1 * SPRITE_WIDTH, 9 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyUp[2] = cropImage(1 * SPRITE_WIDTH, 10 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyLeft = new BufferedImage[3];
        enemyLeft[0] = cropImage(2 * SPRITE_WIDTH, 8 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyLeft[1] = cropImage(2 * SPRITE_WIDTH, 9 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyLeft[2] = cropImage(2 * SPRITE_WIDTH, 10 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyRight = new BufferedImage[3];
        enemyRight[0] = cropImage(3 * SPRITE_WIDTH, 8 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyRight[1] = cropImage(3 * SPRITE_WIDTH, 9 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        enemyRight[2] = cropImage(3 * SPRITE_WIDTH, 10 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        bomb = new BufferedImage[1];
        bomb[0] = cropImage(0 * SPRITE_WIDTH, 11 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
    }

}