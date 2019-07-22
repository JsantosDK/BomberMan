package ciffar.loaders;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {

    private ImageLoader(){};

    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(org.academiadecodigo.bootcamp.gfx.ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
