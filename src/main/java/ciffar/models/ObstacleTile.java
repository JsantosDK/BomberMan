package ciffar.models;

import java.awt.image.BufferedImage;

public class ObstacleTile extends Tile{

    public ObstacleTile(BufferedImage bufferedImage) {
        super(bufferedImage);
        solid = true;
    }
}
