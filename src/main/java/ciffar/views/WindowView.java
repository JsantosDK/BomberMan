package ciffar.views;

import ciffar.controllers.WindowController;
import ciffar.graphics.Assets;

import java.awt.*;

public class WindowView implements View {

    private WindowController windowController;

    public void init() {
        update();
        render();
    }

    private void update() {
    }

    private void render() {
        windowController.getGraphics().clearRect(0, 0, Assets.GAME_WIDTH, Assets.GAME_HEIGHT);
        windowController.getGraphics().setColor(new Color(47, 47, 46));
        windowController.getGraphics().fillRect(0, 0, Assets.GAME_WIDTH, Assets.GAME_HEIGHT);

        windowController.getBufferStrategy().show();
        windowController.getGraphics().dispose();
    }

    public void setWindowController(WindowController windowController) {
        this.windowController = windowController;
    }


}
