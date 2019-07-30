package ciffar.views.entities.creatures;

import ciffar.services.Animation;
import ciffar.services.entities.creatures.AbstractCreatureService;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.entities.AbstractEntityView;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractCreaturesView extends AbstractEntityView {

    private AbstractCreatureService creatureService;
    protected Animation animationDown;
    protected Animation animationUp;
    protected Animation animationLeft;
    protected Animation animationRight;

    public void init() {
        animationDown.updateFrame();
        animationUp.updateFrame();
        animationLeft.updateFrame();
        animationRight.updateFrame();
        render(graphics);
    }

    protected void render(Graphics graphics) {
        graphics.drawImage(currentCreatureImage(), (int) creatureService.getX(), (int) creatureService.getY(), creatureService.getEntityWidth(), creatureService.getEntityHeight(), null);
    }

    protected abstract BufferedImage currentCreatureImage();

    protected BufferedImage movingTowards() {
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

    public void setCreatureService(PlayerService creatureService) {
        this.creatureService = creatureService;
    }

}
