package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.controllers.WorldController;
import ciffar.factories.EntityFactory;
import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.models.EntityManager;
import ciffar.services.WindowService;
import ciffar.services.WorldService;
import ciffar.views.WorldView;
import ciffar.views.WindowView;

import java.awt.*;

public class Bootstrap {

    private WindowService windowService;
    private WindowController windowController;
    private WindowView windowView;
    private WorldService worldService;
    private WorldController worldController;
    private WorldView worldView;
    private KeyLoader keyLoader;
    private EntityManager entityManager;
    private EntityFactory entityFactory;
    private Assets assets;

    public Bootstrap() {
        assets = new Assets();
        assets.init();
        windowService = new WindowService();
        windowController = new WindowController();
        windowView = new WindowView();
        keyLoader = new KeyLoader();

        worldService = new WorldService();
        worldController = new WorldController();
        worldView = new WorldView();
        entityManager = new EntityManager();
        entityFactory = new EntityFactory();

        windowController.setWindowView(windowView);
        windowController.setWindowService(windowService);
        windowController.addKeyLoader(keyLoader);
        windowView.setWindowController(windowController);
        windowView.setEntityManager(entityManager);
        windowView.setWorldView(worldView);
        worldService.setEntityManager(entityManager);
        worldService.setEntityFactory(entityFactory);
        worldController.setWorldService(worldService);
        worldController.setWorldView(worldView);
        worldView.setGraphics(windowService.getGraphics());
        worldView.setWorldService(worldService);
        entityFactory.setEntityManager(entityManager);
        entityFactory.setWorldService(worldService);
        entityFactory.setKeyLoader(keyLoader);
        entityManager.setGraphics(windowService.getGraphics());

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
