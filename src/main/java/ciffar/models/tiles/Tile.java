package ciffar.models.tiles;

import java.awt.image.BufferedImage;

public abstract class Tile {

    protected BufferedImage bufferedImage;
    protected boolean solid;

    public Tile(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public boolean isSolid() {
        return solid;
    }
}
