package org.academiadecodigo.bootcamp.state;

import org.academiadecodigo.bootcamp.Game;

import java.awt.*;

public abstract class State {

    protected Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void update();

    public abstract void render(Graphics graphics);


}
