package org.academiadecodigo.bootcamp.state;

import org.academiadecodigo.bootcamp.Handler;
import org.academiadecodigo.bootcamp.entity.creatures.Player;
import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.tile.Tile;
import org.academiadecodigo.bootcamp.world.World;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Handler handler) {
        super(handler);
        world = new World(handler,"resources/level01/world.txt");
        handler.setWorld(world);
        player = new Player(20,25, handler);

        handler.getGame().getGameCamera().move(100,100);
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
