package org.academiadecodigo.bootcamp.entity.creatures;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.gfx.Assets;

import java.awt.*;

public class Player extends Creature {

    public Player(Game game, float x, float y) {
        super(game, x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
    }

    public void update() {
        getInput();
        move();
        game.getGameCamera().centerOnEntity(this);
    }


    private void getInput(){
        xMove = 0;
        yMove = 0;

        if (super.game.getKeyManager().isUp()){
            yMove = -speed;
        }
        if (super.game.getKeyManager().isDown()){
            yMove = speed;
        }
        if (super.game.getKeyManager().isLeft()){
            xMove = -speed;
        }
        if (super.game.getKeyManager().isRight()){
            xMove = speed;
        }
    }


    public void render(Graphics graphics) {
        graphics.drawImage(Assets.playerLeft1,(int) (x -game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()),width,height,null);
    }
}
