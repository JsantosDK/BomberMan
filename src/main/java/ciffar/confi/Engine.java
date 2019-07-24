package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.controllers.entities.creatures.PlayerController;

public class Engine implements Runnable {

    private Thread thread;
    private boolean running;
    private WindowController windowController;
    private PlayerController playerController;

    public void run() {
        int FPS = 60;
        double timeUntilUpdate = 1000000000 / FPS;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timeUntilUpdate;
            lastTime = now;

            if (delta >= 1) {

                //Needs to be exchange for a gamestate
                windowController.init();
                playerController.init();
                delta--;
            }
        }
    }

    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setWindowController(WindowController windowController) {
        this.windowController = windowController;
    }

    public void setPlayerController(PlayerController playerController) {
        this.playerController = playerController;
    }
}
