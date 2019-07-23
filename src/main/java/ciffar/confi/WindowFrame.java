package ciffar.confi;

import javax.swing.*;

public class WindowFrame {

    private JFrame frame;

    public WindowFrame(String title, int windowWidth, int windowHeight) {
        setUpWindow(title, windowWidth, windowHeight);
    }

    private void setUpWindow(String title, int windowWidth, int windowHeight) {
        createFrame(title, windowWidth, windowHeight);
    }

    private void createFrame(String title, int windowWidth, int windowHeight) {
        frame = new JFrame(title);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

}
