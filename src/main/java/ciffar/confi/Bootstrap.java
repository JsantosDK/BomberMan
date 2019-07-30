package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.controllers.WorldController;
import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.services.WindowService;
import ciffar.services.WorldService;
import ciffar.views.WorldView;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.entities.creatures.PlayerView;
import ciffar.views.WindowView;

import java.awt.*;

public class Bootstrap {

    private WindowService windowService;
    private Graphics graphics;
    private WindowController windowController;
    private WindowView windowView;
    private PlayerService playerService;
    private PlayerController playerController;
    private PlayerView playerView;
    private WorldService worldService;
    private WorldController worldController;
    private WorldView worldView;
    private KeyLoader keyLoader;
    private EntityManager entityManager;

    public Bootstrap() {
        Assets.init();
        windowService = new WindowService();
        graphics = windowService.getGraphics();
        windowController = new WindowController();
        windowView = new WindowView();
        keyLoader = new KeyLoader();
        playerService = new PlayerService(Assets.SPRITE_HEIGHT,Assets.SPRITE_WIDTH);
        playerController = new PlayerController();
        playerView = new PlayerView();
        worldService = new WorldService();
        worldController = new WorldController();
        worldView = new WorldView();
        entityManager = new EntityManager(playerController);


        windowController.setWindowView(windowView);
        windowController.setWindowService(windowService);
        windowController.addKeyLoader(keyLoader);
        windowView.setWindowController(windowController);
        playerService.setWorldService(worldService);
        playerController.setPlayerService(playerService);
        playerController.setView(playerView);
        playerController.setKeyLoader(keyLoader);
        windowView.setPlayerView(playerView);
        playerView.setCreatureService(playerService);
        playerView.setPlayerController(playerController);
        playerView.setGraphics(graphics);
        windowView.setWorldView(worldView);
        worldController.setWorldService(worldService);
        worldController.setWorldView(worldView);
        worldView.setGraphics(graphics);
        worldView.setWorldService(worldService);
        entityManager.setGraphics(graphics);
        windowView.setEntityManager(entityManager);


        Engine engine = new Engine();







        //Needs to be exchanged for a game state
        engine.setWindowController(windowController);
        engine.setPlayerController(playerController);
        engine.setWorldController(worldController);

        engine.start();


        setup();
    }

    private void setup() {


    }


}
