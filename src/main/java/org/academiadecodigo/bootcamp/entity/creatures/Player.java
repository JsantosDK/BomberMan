package org.academiadecodigo.bootcamp.entity.creatures;

import org.academiadecodigo.bootcamp.Handler;
import org.academiadecodigo.bootcamp.gfx.Assets;

import java.awt.*;

public class Player extends Creature {

    public Player(float x, float y, Handler handler) {
        super(x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT, handler);
    }

    public void update() {
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
    }


    private void getInput(){
        xMove = 0;
        yMove = 0;

        if (handler.getKeyManager().isUp()){
            yMove = -speed;
        }
        if (handler.getKeyManager().isDown()){
            yMove = speed;
        }
        if (handler.getKeyManager().isLeft()){
            xMove = -speed;
        }
        if (handler.getKeyManager().isRight()){
            xMove = speed;
        }
    }


    public void render(Graphics graphics) {
        graphics.drawImage(Assets.playerLeft1,(int) (x -handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()),width,height,null);
    }
}
