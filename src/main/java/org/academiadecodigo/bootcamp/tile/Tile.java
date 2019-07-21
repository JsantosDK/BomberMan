package org.academiadecodigo.bootcamp.tile;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    public static Tile[] tiles = new Tile[256];
    public static Tile wallTopTile = new TopTile(0);
    public static Tile wallBottomTile = new BottomTile(1);
    public static Tile interiorTile = new InteriorTile(8);

    public final static int tileWidth = 25;
    public final static int tileHeight = 25;
    protected BufferedImage texture;
    protected final int iD;

    public Tile(BufferedImage texture, int iD) {
        this.texture = texture;
        this.iD = iD;

        tiles[iD] = this;
    }

    public void update(){

    }

    public void render(Graphics graphics, int x, int y){
        graphics.drawImage(texture,x,y, tileWidth, tileHeight,null);
    }

    public int getiD() {
        return iD;
    }

    public boolean isSolid(){
        return false;
    }

}
