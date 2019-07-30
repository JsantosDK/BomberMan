package ciffar.views;

import ciffar.graphics.Assets;
import ciffar.services.WorldService;
import ciffar.views.entities.View;

import java.awt.*;

public class WorldView implements View {

    private Graphics graphics;
    private WorldService worldService;

    public void init() {
        render();
    }

    private void render() {
        for (int i = 0; i < worldService.getWorldHeight(); i++) {
            for (int j = 0; j < worldService.getWorldWidth(); j++) {
                graphics.drawImage(worldService.getWorldGrid()[i][j].getBufferedImage(), j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
            }
        }
    }


    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }
}
