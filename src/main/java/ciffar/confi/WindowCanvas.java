package ciffar.confi;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class WindowCanvas {

    private Canvas canvas;
    private int windowWidth;
    private int windowHeight;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;


    public WindowCanvas(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        createCanvas();
    }

    private void createCanvas(){
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(windowWidth,windowHeight));
        canvas.setMaximumSize(new Dimension(windowWidth,windowHeight));
        canvas.setMinimumSize(new Dimension(windowWidth,windowHeight));
        canvas.setFocusable(false);
    }

    public void update(){


    }

    public void render(){
        if (!setupBufferStrategy()) {return;}

        graphics = bufferStrategy.getDrawGraphics();

        graphics.clearRect(0,0,windowWidth,windowHeight);
        graphics.setColor(new Color(47,47,45));
        graphics.fillRect(0,0,windowWidth,windowHeight);

        bufferStrategy.show();
        graphics.dispose();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    private boolean setupBufferStrategy(){
        bufferStrategy = canvas.getBufferStrategy();
        if (bufferStrategy == null){
            canvas.createBufferStrategy(3);
            return false;
        }
        return true;
    }

}
