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



    }

}