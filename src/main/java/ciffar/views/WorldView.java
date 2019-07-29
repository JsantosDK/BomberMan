package ciffar.views;

import ciffar.controllers.WorldController;
import ciffar.graphics.Assets;
import ciffar.services.WorldService;

import java.awt.*;
import java.awt.image.BufferedImage;

public class WorldView implements View {

    private Graphics graphics;
    private WorldService worldService;
    private WorldController worldController;

    public void init() {
        render();
    }

    private void render() {
        for (int i = 0; i < worldService.getWorldHeight(); i++) {
            for (int j = 0; j < worldService.getWorldWidth(); j++) {
                graphics.drawImage(worldService.getWorldGrid()[i][j], j * Assets.SPRITE_WIDTH, i * Assets.SPRITE_HEIGHT, null);
            }
        }
    }


    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void setWorldController(WorldController worldController) {
        this.worldController = worldController;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }
}
