package org.academiadecodigo.bootcamp.gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 20;
    private static final int height = 25;

    public static BufferedImage playerBase;
    public static BufferedImage playerDown1;
    public static BufferedImage playerDown2;
    public static BufferedImage playerDown3;
    public static BufferedImage playerDown4;
    public static BufferedImage playerUp1;
    public static BufferedImage playerUp2;
    public static BufferedImage playerUp3;
    public static BufferedImage playerUp4;
    public static BufferedImage playerLeft1;
    public static BufferedImage playerLeft2;
    public static BufferedImage playerLeft3;
    public static BufferedImage playerLeft4;
    public static BufferedImage playerRight1;
    public static BufferedImage playerRight2;
    public static BufferedImage playerRight3;
    public static BufferedImage playerRight4;


    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/player/player1.png"));
        playerBase = sheet.crop(0 * width,0 * height,width,height);
        playerDown1  = sheet.crop(0 * width,1 * height,width,height);
        playerDown2  = sheet.crop(1 * width,1 * height,width,height);
        playerDown3  = sheet.crop(2 * width,1 * height,width,height);
        playerDown4  = sheet.crop(3 * width,1 * height,width,height);
        playerUp1  = sheet.crop(0 * width,2 * height,width,height);
        playerUp2  = sheet.crop(1 * width,2 * height,width,height);
        playerUp3  = sheet.crop(2 * width,2 * height,width,height);
        playerUp4  = sheet.crop(3 * width,2 * height,width,height);
        playerLeft1  = sheet.crop(0 * width,3 * height,width,height);
        playerLeft2  = sheet.crop(1 * width,3 * height,width,height);
        playerLeft3  = sheet.crop(2 * width,3 * height,width,height);
        playerLeft4  = sheet.crop(3 * width,3 * height,width,height);
        playerRight1  = sheet.crop(0 * width,4 * height,width,height);
        playerRight2  = sheet.crop(1 * width,4 * height,width,height);
        playerRight3  = sheet.crop(2 * width,4 * height,width,height);
        playerRight4  = sheet.crop(3 * width,4 * height,width,height);


    }
}
