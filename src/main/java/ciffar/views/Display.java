package ciffar.views;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame;
    private Canvas canvas;



    public Display(String title, int windowWidth, int windowHeight) {
        setUpWindow(title, windowWidth, windowHeight);
    }

    private void setUpWindow(String title, int windowWidth, int windowHeight){
        createFrame(title, windowWidth, windowHeight);
        createCanvas(windowHeight, windowWidth);

        frame.add(canvas);
        frame.pack();
    }

    private void createFrame(String title, int windowWidth, int windowHeight){
        frame = new JFrame(title);
        frame.setSize(windowWidth,windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
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

    public JFrame getFrame() {
        return frame;
    }
    
}
