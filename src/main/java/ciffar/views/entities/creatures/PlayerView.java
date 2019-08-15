package ciffar.views.entities.creatures;

import ciffar.graphics.Assets;
import ciffar.models.Animation;

import java.awt.image.BufferedImage;

public class PlayerView extends AbstractCreaturesView {

    public PlayerView() {
        animationDown = new Animation(100, Assets.playerDown);
        animationUp = new Animation(100, Assets.playerUp);
        animationLeft = new Animation(100, Assets.playerLeft);
        animationRight = new Animation(100, Assets.playerRight);
    }

    protected BufferedImage currentCreatureImage() {
        if (abstractCreatureController.isMoving()){
            return movingTowards();
        }
        return pointTowards();
    }

}
