package ciffar.graphics;

import ciffar.loaders.ImageLoader;

import java.awt.image.BufferedImage;

public class Assets {

    public final static int SPRITE_WIDTH = 25;
    public final static int SPRITE_HEIGHT = 25;
    public final static int GAME_WIDTH = 775;
    public final static int GAME_HEIGHT = 450;
    public final static String GAME_TITLE ="My Bomberman";

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


    public static void init() {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/player/player1.png"));
        playerDown = new BufferedImage[3];
        playerDown[0] = sheet.cropImage(0 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown[1] = sheet.cropImage(0 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerDown[2] = sheet.cropImage(0 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp = new BufferedImage[3];
        playerUp[0] = sheet.cropImage(1 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp[1] = sheet.cropImage(1 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerUp[2] = sheet.cropImage(1 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft = new BufferedImage[3];
        playerLeft[0] = sheet.cropImage(2 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft[1] = sheet.cropImage(2 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerLeft[2] = sheet.cropImage(2 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight = new BufferedImage[3];
        playerRight[0] = sheet.cropImage(3 * SPRITE_WIDTH, 0 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight[1] = sheet.cropImage(3 * SPRITE_WIDTH, 1 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        playerRight[2] = sheet.cropImage(3 * SPRITE_WIDTH, 2 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);

        wallBottomLeft = sheet.cropImage(0 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottomRight = sheet.cropImage(1 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopLeft = sheet.cropImage(2 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTopRight = sheet.cropImage(3 * SPRITE_WIDTH, 3 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallBottom = sheet.cropImage(1 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallTop = sheet.cropImage(0 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallLeft = sheet.cropImage(2 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        wallRight   = sheet.cropImage(3 * SPRITE_WIDTH, 4 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior = new BufferedImage[4];
        interior[0] = sheet.cropImage(0 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[1] = sheet.cropImage(1 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[2] = sheet.cropImage(2 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
        interior[3] = sheet.cropImage(3 * SPRITE_WIDTH, 5 * SPRITE_HEIGHT, SPRITE_WIDTH, SPRITE_HEIGHT);
    }

}