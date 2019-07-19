package org.academiadecodigo.bootcamp.view;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame window;
    private Canvas canvas;
    private String title;
    private int windowWidth;
    private int windowHeight;

    public Display(String title, int windowWidth, int windowHeight) {
        this.title = title;
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        window = new JFrame(this.title);
        startWindow();
    }

    private void startWindow(){
        window.setSize(windowWidth, windowHeight);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(windowWidth,windowHeight));
        canvas.setMaximumSize(new Dimension(windowWidth,windowHeight));
        canvas.setMinimumSize(new Dimension(windowWidth,windowHeight));

        window.add(canvas);
        window.pack();

    }
}
