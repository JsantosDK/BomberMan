package ciffar.confi;

import java.awt.*;

public class WindowCanvas {

    private Canvas canvas;

    public WindowCanvas(int windowWidth, int windowHeight) {
        createCanvas(windowWidth, windowHeight);
    }

    private void createCanvas(int windowWidth, int windowHeight){
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(windowWidth,windowHeight));
        canvas.setMaximumSize(new Dimension(windowWidth,windowHeight));
        canvas.setMinimumSize(new Dimension(windowWidth,windowHeight));
        canvas.setFocusable(false);
    }

    public Canvas getCanvas() {
        return canvas;
    }

}
