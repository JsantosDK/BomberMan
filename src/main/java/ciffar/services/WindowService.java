package ciffar.services;

import ciffar.graphics.Assets;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class WindowService {

    private Canvas canvas;
    private JFrame frame;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;

    public WindowService() {
        graphics = null;
        createFrame();
        createCanvas();
    }

    private void createFrame() {
        frame = new JFrame(Assets.GAME_TITLE);
        frame.setSize(Assets.GAME_WIDTH, Assets.GAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createCanvas() {
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(Assets.GAME_WIDTH, Assets.GAME_HEIGHT));
        canvas.setMaximumSize(new Dimension(Assets.GAME_WIDTH, Assets.GAME_HEIGHT));
        canvas.setMinimumSize(new Dimension(Assets.GAME_WIDTH, Assets.GAME_HEIGHT));
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();
    }

    public boolean setupBufferStrategy() {
        bufferStrategy = canvas.getBufferStrategy();
        if (bufferStrategy == null) {
            canvas.createBufferStrategy(3);
            return false;
        }
        graphics = bufferStrategy.getDrawGraphics();
        return true;
    }

    public BufferStrategy getBufferStrategy() {
        return bufferStrategy;
    }

    public Graphics getGraphics() {
        return graphics;
    }


}
