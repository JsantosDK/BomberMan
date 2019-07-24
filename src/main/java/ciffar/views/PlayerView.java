package ciffar.views;

import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.graphics.Assets;

import java.awt.*;

public class PlayerView implements View {

    private PlayerController playerController;
    private Graphics graphics;

    public void init() {
        render(graphics);
    }

    private void render(Graphics graphics){
        graphics.drawImage(Assets.playerDown0, (int) playerController.getX(), (int) playerController.getY(), playerController.playerWidth(), playerController.playerHeight(), null);
    }

    public void setPlayerController(PlayerController playerController) {
        this.playerController = playerController;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}
