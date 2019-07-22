package ciffar.graphics;

import java.awt.image.BufferedImage;

public class SpriteSheet {

    private BufferedImage sheet;

    protected SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    protected BufferedImage cropImage(int x, int y, int width, int height) {
        return sheet.getSubimage(x, y, width, height);
    }
}
