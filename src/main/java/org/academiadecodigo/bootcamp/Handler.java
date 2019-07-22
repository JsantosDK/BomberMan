package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gfx.GameCamera;
import org.academiadecodigo.bootcamp.input.KeyManager;
import org.academiadecodigo.bootcamp.world.World;

public class Handler {

    private Game game;
    private World world;

    public Handler(Game game) {
        this.game = game;
    }

    public int getWidth(){
        return game.getWidth();
    }

    public int getHeigh(){
        return game.getHeigth();
    }

    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

}