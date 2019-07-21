package org.academiadecodigo.bootcamp.tile;

import org.academiadecodigo.bootcamp.gfx.Assets;

public class TopTile extends Tile {

    public TopTile(int iD) {
        super(Assets.wallTop, iD);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
