package ciffar.controllers;

import ciffar.services.WindowService;
import ciffar.views.View;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class WindowController {

    private View windowView;
    private WindowService windowService;

    public void init() {
        if (windowService.setupBufferStrategy()) {
            windowView.init();
        }
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
