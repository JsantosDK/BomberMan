package org.academiadecodigo.bootcamp.state;

import org.academiadecodigo.bootcamp.entity.creatures.Player;
import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.tile.Tile;
import org.academiadecodigo.bootcamp.world.World;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Game game) {
        super(game);
        player = new Player(game,20,25);
        world = new World(game,"resources/level01/world.txt");

        game.getGameCamera().move(100,100);
    }


    public void update() {
        world.update();
        player.update();


    }

    public void render(Graphics graphics) {
        world.render(graphics);
        player.render(graphics);

        Tile.tiles[0].render(graphics,0,0);
    }
}
