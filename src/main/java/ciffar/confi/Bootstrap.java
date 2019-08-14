package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.controllers.WorldController;
import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.models.EntityManager;
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
    private Assets assets;

    public Bootstrap() {
        assets = new Assets();
        assets.init();
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
        entityManager = new EntityManager();


        windowController.setWindowView(windowView);
        windowController.setWindowService(windowService);
        windowController.addKeyLoader(keyLoader);
        windowView.setWindowController(windowController);
        playerService.setWorldService(worldService);
        playerController.setPlayerService(playerService);
        playerController.setView(playerView);
        playerController.setKeyLoader(keyLoader);
        playerView.setCreatureService(playerService);
        playerView.setPlayerController(playerController);
        playerView.setGraphics(graphics);
        windowView.setWorldView(worldView);
        worldService.setEntityManager(entityManager);
        worldController.setWorldService(worldService);
        worldController.setWorldView(worldView);
        worldView.setGraphics(graphics);
        worldView.setWorldService(worldService);
        windowView.setEntityManager(entityManager);
        entityManager.setGraphics(graphics);
        playerService.setCollisionDetector(entityManager.getCollisionDetector());
        entityManager.addEntity(playerController,playerService);


        Engine engine = new Engine();







        //Needs to be exchanged for a game state
        engine.setWindowController(windowController);
        engine.setWorldController(worldController);
        engine.setEntityManager(entityManager);
        engine.start();


        setup();
    }

    private void setup() {


    }


}
