package ciffar.views.entities.creatures;

import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.graphics.Assets;
import ciffar.models.Animation;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

import java.awt.image.BufferedImage;

public class PlayerView extends AbstractCreaturesView {

    private PlayerController playerController;

    public PlayerView() {
        animationDown = new Animation(100, Assets.playerDown);
        animationUp = new Animation(100, Assets.playerUp);
        animationLeft = new Animation(100, Assets.playerLeft);
        animationRight = new Animation(100, Assets.playerRight);
    }

    protected BufferedImage currentCreatureImage() {
        if (playerController.isMoving()){
            return movingTowards();
        }
        return pointTowards();
    }

    private BufferedImage pointTowards() {
        if (playerController.getPointTowardsDirection() == Directions.DOWN) {
            return animationDown.getBaseFrame();
        }
        if (playerController.getPointTowardsDirection() == Directions.UP) {
            return animationUp.getBaseFrame();
        }
        if (playerController.getPointTowardsDirection() == Directions.LEFT) {
            return animationLeft.getBaseFrame();
        }
        return animationRight.getBaseFrame();
    }

    public void setPlayerController(PlayerController playerController) {
        this.playerController = playerController;
    }

}
