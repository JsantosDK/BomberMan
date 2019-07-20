package org.academiadecodigo.bootcamp.state;

import org.academiadecodigo.bootcamp.entity.creatures.Player;
import org.academiadecodigo.bootcamp.Game;

import java.awt.*;

public class GameState extends State {

    private Player player;

    public GameState(Game game) {
        super(game);
        player = new Player(game,20,25);
    }


    public void update() {
        player.update();
    }

    public void render(Graphics graphics) {
       player.render(graphics);
    }
}
