package ciffar.views.entities;

import ciffar.services.AnimationService;
import ciffar.services.entities.creatures.AbstractCreatureService;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.View;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractCreaturesView implements View {

    private AbstractCreatureService creatureService;
    private Graphics graphics;
    AnimationService animationDown;
    AnimationService animationUp;
    AnimationService animationLeft;
    AnimationService animationRight;

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

    BufferedImage movingTowards() {
        if (creatureService.getyMove() > 0) {
            return animationDown.getCurrentFrame();
        }
        if (creatureService.getyMove() < 0) {
            return animationUp.getCurrentFrame();
        }
        if (creatureService.getxMove() < 0) {
            return animationLeft.getCurrentFrame();
        }
        return animationRight.getCurrentFrame();
    }

    public void setCreatureService(PlayerService creatureService) {
        this.creatureService = creatureService;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

}
