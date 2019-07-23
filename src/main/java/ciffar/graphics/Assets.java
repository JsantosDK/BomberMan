package ciffar.graphics;

import ciffar.loaders.ImageLoader;

import java.awt.image.BufferedImage;

public class Assets {

    static final int SPRITE_WIDTH = 25;
    static final int SPRITE_HEIGHT = 25;
    public final static int GAME_WIDTH = 700;
    public final static int GAME_HEIGHT = 400;
    public final static String GAME_TITLE ="My Bomberman";

    public static BufferedImage playerDown0;
    public static BufferedImage playerDown1;
    public static BufferedImage playerDown2;
    public static BufferedImage playerUp0;
    public static BufferedImage playerUp1;
    public static BufferedImage playerUp2;
    public static BufferedImage playerLeft0;
    public static BufferedImage playerLeft1;
    public static BufferedImage playerLeft2;
    public static BufferedImage playerRight0;
    public static BufferedImage playerRight1;
    public static BufferedImage playerRight2;
    public static BufferedImage wallBottomLeft;
    public static BufferedImage wallBottomRight;
    public static BufferedImage wallTopLeft;
    public static BufferedImage wallTopRight;
    public static BufferedImage wallBottom;
    public static BufferedImage wallTop;
    public static BufferedImage wallLeft;
    public static BufferedImage wallRight;
    public static BufferedImage interior0;
    public static BufferedImage interior1;
    public static BufferedImage interior2;
    public static BufferedImage interior3;


    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/player/player1.png"));
        playerDown0 = sheet.cropImage(0 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown1 = sheet.cropImage(0 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown2 = sheet.cropImage(0 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp0 = sheet.cropImage(1 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp1 = sheet.cropImage(1 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp2 = sheet.cropImage(1 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft0 = sheet.cropImage(2 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft1 = sheet.cropImage(2 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft2 = sheet.cropImage(2 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight0 = sheet.cropImage(3 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight1 = sheet.cropImage(3 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight2 = sheet.cropImage(3 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottomLeft = sheet.cropImage(0 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottomRight = sheet.cropImage(1 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopLeft = sheet.cropImage(2 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopRight = sheet.cropImage(3 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottom = sheet.cropImage(0 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTop = sheet.cropImage(1 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallLeft = sheet.cropImage(2 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallRight = sheet.cropImage(3 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior0 = sheet.cropImage(0 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior1 = sheet.cropImage(1 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior2 = sheet.cropImage(2 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior3 = sheet.cropImage(3 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
    }

}