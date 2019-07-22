package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.display.Display;
import org.academiadecodigo.bootcamp.gfx.Assets;
import org.academiadecodigo.bootcamp.gfx.GameCamera;
import org.academiadecodigo.bootcamp.input.KeyManager;
import org.academiadecodigo.bootcamp.state.GameState;
import org.academiadecodigo.bootcamp.state.GameStateManager;
import org.academiadecodigo.bootcamp.state.MenuState;
import org.academiadecodigo.bootcamp.state.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{

    private Display display;
    private Thread thread;
    private String title;
    private int width;
    private int heigth;
    private boolean running;
    private BufferStrategy bufferStrategy;
    private Graphics graphics;
    private State gameState;
    private State menuState;
    private KeyManager keyManager;
    private GameCamera gameCamera;
    private Handler handler;

    public Game(String title, int width, int heigth) {
        this.title = title;
        this.width = width;
        this.heigth = heigth;
        keyManager = new KeyManager();

    }

    private void init(){
        display = new Display(title,width,heigth);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();

        gameCamera = new GameCamera(this,0,0);
        handler = new Handler(this);

        gameState = new GameState(handler);
        menuState = new MenuState(handler);
        GameStateManager.setCurrentState(gameState);
    }

    private void update(){
        keyManager.update();

        if (GameStateManager.getCurrentState() != null){
            GameStateManager.getCurrentState().update();
        }
    }

    private void render(){
        bufferStrategy = display.getCanvas().getBufferStrategy();
        if (bufferStrategy == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        graphics = bufferStrategy.getDrawGraphics();

        graphics.clearRect(0,0,width,heigth);

        if (GameStateManager.getCurrentState() != null){
            GameStateManager.getCurrentState().render(graphics);
        }

        bufferStrategy.show();
        graphics.dispose();
    }

    public synchronized void start(){
        if (running) {return;}
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if (!running) {return;}
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void run() {
        init();

        int fps = 60;
        double timeUntilUpdate = 1000000000/fps;
        double delta = 0;
        long now;
        long lasttime = System.nanoTime();

        while(running){
            now = System.nanoTime();
            delta += (now - lasttime) / timeUntilUpdate;
            lasttime = now;

            if (delta >= 1) {
                update();
                render();
                delta--;
            }
        }

    }


}
