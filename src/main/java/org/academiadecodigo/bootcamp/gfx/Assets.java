package org.academiadecodigo.bootcamp.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 25;
    private static final int height = 25;

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


    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/player/player1.png"));
        playerDown0 = sheet.crop(0 * width,0 * height,width,height);
        playerDown1  = sheet.crop(0 * width,1 * height,width,height);
        playerDown2  = sheet.crop(0 * width,2 * height,width,height);
        playerUp0  = sheet.crop(1 * width,0 * height,width,height);
        playerUp1  = sheet.crop(1 * width,1 * height,width,height);
        playerUp2  = sheet.crop(1 * width,2 * height,width,height);
        playerLeft0  = sheet.crop(2 * width,0 * height,width,height);
        playerLeft1  = sheet.crop(2 * width,1 * height,width,height);
        playerLeft2  = sheet.crop(2 * width,2 * height,width,height);
        playerRight0  = sheet.crop(3 * width,0 * height,width,height);
        playerRight1  = sheet.crop(3 * width,1 * height,width,height);
        playerRight2  = sheet.crop(3 * width,2 * height,width,height);
        wallBottomLeft = sheet.crop(0 * width, 3 *height,width,height);
        wallBottomRight = sheet.crop(1 * width, 3 *height,width,height);
        wallTopLeft = sheet.crop(2 * width, 3 * height,width,height);
        wallTopRight = sheet.crop(3 * width, 3 * height,width,height);
        wallBottom = sheet.crop(0 * width, 4 * height,width,height);
        wallTop = sheet.crop(1 * width, 4 * height,width,height);
        wallLeft = sheet.crop(2 * width, 4 * height,width,height);
        wallRight = sheet.crop(3 * width, 4 * height,width,height);
        interior0 = sheet.crop(0 * width, 5 * height,width,height);
        interior1 = sheet.crop(1 * width, 5 * height,width,height);
        interior2 = sheet.crop(2 * width, 5 * height,width,height);
        interior3 = sheet.crop(3 * width, 5 * height,width,height);


    }
}
