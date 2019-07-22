package org.academiadecodigo.bootcamp.gfx;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.entity.Entity;

public class GameCamera {

    private  Game game;
    private float xOffset;
    private float yOffset;

    public GameCamera(Game game, float xOffset, float yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.game = game;
    }

    public void centerOnEntity(Entity entity){
        xOffset = entity.getX() - game.getWidth() / 2 - entity.getWidth() / 2;
        yOffset = entity.getY() - game.getHeigth() / 2 - entity.getHeight() / 2;
    }

    public void move(float xAmount, float yAmount){
        xOffset += xAmount;
        yOffset += yAmount;
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }
}
