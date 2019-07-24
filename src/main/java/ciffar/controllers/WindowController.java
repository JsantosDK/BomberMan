package ciffar.controllers;

import ciffar.loaders.KeyLoader;
import ciffar.services.WindowService;
import ciffar.views.View;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class WindowController {

    private View windowView;
    private WindowService windowService;

    public void init() {
        if (windowService.setupBufferStrategy()) {
            update();
            windowView.init();
        }
    }

    private void update() {
    }

    public void addKeyLoader(KeyLoader keyLoader){
        windowService.addKeyLoader(keyLoader);
    }

    public void setWindowView(View windowView) {
        this.windowView = windowView;
    }

    public void setWindowService(WindowService windowService) {
        this.windowService = windowService;
    }

    public BufferStrategy getBufferStrategy() {
        return windowService.getBufferStrategy();
    }

    public Graphics getGraphics() {
        return windowService.getGraphics();
    }
}
