package ciffar.graphics;

import ciffar.loaders.ImageLoader;

import java.awt.image.BufferedImage;

public class Assets {

    static final int width = 25;
    static final int height = 25;

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
        playerDown0 = sheet.cropImage(0 * width, 0 * height, width, height);
        playerDown1 = sheet.cropImage(0 * width, 1 * height, width, height);
        playerDown2 = sheet.cropImage(0 * width, 2 * height, width, height);
        playerUp0 = sheet.cropImage(1 * width, 0 * height, width, height);
        playerUp1 = sheet.cropImage(1 * width, 1 * height, width, height);
        playerUp2 = sheet.cropImage(1 * width, 2 * height, width, height);
        playerLeft0 = sheet.cropImage(2 * width, 0 * height, width, height);
        playerLeft1 = sheet.cropImage(2 * width, 1 * height, width, height);
        playerLeft2 = sheet.cropImage(2 * width, 2 * height, width, height);
        playerRight0 = sheet.cropImage(3 * width, 0 * height, width, height);
        playerRight1 = sheet.cropImage(3 * width, 1 * height, width, height);
        playerRight2 = sheet.cropImage(3 * width, 2 * height, width, height);
        wallBottomLeft = sheet.cropImage(0 * width, 3 * height, width, height);
        wallBottomRight = sheet.cropImage(1 * width, 3 * height, width, height);
        wallTopLeft = sheet.cropImage(2 * width, 3 * height, width, height);
        wallTopRight = sheet.cropImage(3 * width, 3 * height, width, height);
        wallBottom = sheet.cropImage(0 * width, 4 * height, width, height);
        wallTop = sheet.cropImage(1 * width, 4 * height, width, height);
        wallLeft = sheet.cropImage(2 * width, 4 * height, width, height);
        wallRight = sheet.cropImage(3 * width, 4 * height, width, height);
        interior0 = sheet.cropImage(0 * width, 5 * height, width, height);
        interior1 = sheet.cropImage(1 * width, 5 * height, width, height);
        interior2 = sheet.cropImage(2 * width, 5 * height, width, height);
        interior3 = sheet.cropImage(3 * width, 5 * height, width, height);
    }

}