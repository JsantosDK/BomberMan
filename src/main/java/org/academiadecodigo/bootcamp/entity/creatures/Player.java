package org.academiadecodigo.bootcamp.entity.creatures;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.gfx.Assets;

import java.awt.*;

public class Player extends Creature {

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
        this.game = game;
    }

    public void update() {
        getInput();
        move();
    }


    private void getInput(){
        xMove = 0;
        yMove = 0;

        if (game.getKeyManager().isUp()){
            yMove = -speed;
        }
        if (game.getKeyManager().isDown()){
            yMove = speed;
        }
        if (game.getKeyManager().isLeft()){
            xMove = -speed;
        }
        if (game.getKeyManager().isRight()){
            xMove = speed;
        }
    }


    public void render(Graphics graphics) {
        graphics.drawImage(Assets.playerLeft1,(int) x, (int) y,width,height,null);
    }
}
