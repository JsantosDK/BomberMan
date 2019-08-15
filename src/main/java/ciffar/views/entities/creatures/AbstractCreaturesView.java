package ciffar.views.entities.creatures;

import ciffar.controllers.entities.creatures.AbstractCreatureController;
import ciffar.models.Animation;
import ciffar.services.entities.creatures.AbstractCreatureService;
import ciffar.views.entities.AbstractEntityView;
import ciffar.models.Directions;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractCreaturesView extends AbstractEntityView {

    private AbstractCreatureService creatureService;
    Animation animationDown;
    Animation animationUp;
    Animation animationLeft;
    Animation animationRight;
    AbstractCreatureController abstractCreatureController;

    public void init() {
        animationDown.updateFrame();
        animationUp.updateFrame();
        animationLeft.updateFrame();
        animationRight.updateFrame();
        render(graphics);
    }

    protected void render(Graphics graphics) {
        //graphics.setColor(Color.BLUE);
        //graphics.fillRect((int) (creatureService.getX() + creatureService.getCollisionBox().x), (int) (creatureService.getY() + creatureService.getCollisionBox().y), creatureService.getCollisionBox().width, creatureService.getCollisionBox().height);
        graphics.drawImage(currentCreatureImage(), (int) creatureService.getX(), (int) creatureService.getY(), creatureService.getEntityWidth(), creatureService.getEntityHeight(), null);
    }

    protected abstract BufferedImage currentCreatureImage();

    BufferedImage movingTowards() {
        if (creatureService.getVerticalMove() > 0) {
            return animationDown.getCurrentFrame();
        }
        if (creatureService.getVerticalMove() < 0) {
            return animationUp.getCurrentFrame();
        }
        if (creatureService.getHorizontalMove() < 0) {
            return animationLeft.getCurrentFrame();
        }
        return animationRight.getCurrentFrame();
    }

    BufferedImage pointTowards() {
        if (abstractCreatureController.getPointTowardsDirection() == Directions.DOWN) {
            return animationDown.getBaseFrame();
        }
        if (abstractCreatureController.getPointTowardsDirection() == Directions.UP) {
            return animationUp.getBaseFrame();
        }
        if (abstractCreatureController.getPointTowardsDirection() == Directions.LEFT) {
            return animationLeft.getBaseFrame();
        }
        return animationRight.getBaseFrame();
    }

    public void setCreatureService(AbstractCreatureService creatureService) {
        this.creatureService = creatureService;
    }

    public void setCreatureController(AbstractCreatureController abstractCreatureController) {
        this.abstractCreatureController = abstractCreatureController;
    }

}
