package org.academiadecodigo.bootcamp.world;

import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.Handler;
import org.academiadecodigo.bootcamp.tile.Tile;
import org.academiadecodigo.bootcamp.utils.Utils;

import java.awt.*;

public class World {

    private Handler handler;
    private int width;
    private int height;
    private int spawnX;
    private int spawnY;
    private int[][] tiles;

    public World(Handler handler, String path) {
        this.handler = handler;
        loadWorld(path);
    }

    public void update(){

    }

    public void render(Graphics graphics){
        int xStart = (int) Math.max(0, handler.getGame().getGameCamera().getxOffset() / Tile.tileWidth);
        int xEnd = (int) Math.min(width, (handler.getGame().getGameCamera().getxOffset() + handler.getGame().getWidth())/ Tile.tileWidth + 1);
        int yStart = (int)  Math.max(0, handler.getGame().getGameCamera().getyOffset() / Tile.tileHeight);
        int yEnd = (int) Math.min(height, (handler.getGame().getGameCamera().getxOffset() + handler.getGame().getWidth())/ Tile.tileHeight + 1);

        for (int j = yStart; j < yEnd; j++){
            for (int i = xStart; i < xEnd; i++){
                getTile(i,j).render(graphics,(int )(i * Tile.tileWidth - handler.getGame().getGameCamera().getxOffset()),(int) (j * Tile.tileHeight - handler.getGame().getGameCamera().getyOffset()));
            }
        }

    }

    public Tile getTile(int i, int j){
        Tile tile = Tile.tiles[tiles[i][j]];
        if (tile == null) {return Tile.interiorTile;}
        return tile;
    }


    private void loadWorld(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[width][height];
        for (int j = 0; j < height; j++){
            for (int i = 0; i < width; i++){
                tiles[i][j] = Utils.parseInt(tokens[i + j * width + 4]);
            }
        }

    }
}
