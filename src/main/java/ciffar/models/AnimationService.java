package ciffar.services;

import java.awt.image.BufferedImage;

public class AnimationService {

    private int timeBetweenUpdates;
    private int indexOfCurrentImage;
    private long timeOfLastUpdate;
    private long timer;
    private BufferedImage[] arrayOfImages;

    public AnimationService(int timeBetweenUpdates, BufferedImage[] arrayOfImages) {
        this.timeBetweenUpdates = timeBetweenUpdates;
        this.arrayOfImages = arrayOfImages;
        indexOfCurrentImage = 0;
        timeOfLastUpdate = System.currentTimeMillis();
        timer = 0;
    }

    public void updateFrame(){
        timer += System.currentTimeMillis() - timeOfLastUpdate;
        timeOfLastUpdate = System.currentTimeMillis();

        if (timer > timeBetweenUpdates){
            timer = 0;
            indexOfCurrentImage++;
            if (indexOfCurrentImage >= arrayOfImages.length) {
                indexOfCurrentImage = 1;
            }
        }
    }

    public BufferedImage getCurrentFrame(){
        return arrayOfImages[indexOfCurrentImage];
    }

    public BufferedImage getBaseFrame(){
        return arrayOfImages[0];
    }
}


