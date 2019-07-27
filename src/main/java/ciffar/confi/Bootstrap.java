package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.services.WindowService;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.entities.PlayerView;
import ciffar.views.WindowView;

public class Bootstrap {

    private WindowService windowService;
    private WindowController windowController;
    private WindowView windowView;
    private PlayerService playerService;
    private PlayerController playerController;
    private PlayerView playerView;
    private KeyLoader keyLoader;

    public Bootstrap() {
        Assets.init();
        windowService = new WindowService();
        windowController = new WindowController();
        windowView = new WindowView();
        keyLoader = new KeyLoader();
        playerService = new PlayerService(0,0);
        playerController = new PlayerController();
        playerView = new PlayerView();

        windowController.setWindowView(windowView);
        windowController.setWindowService(windowService);
        windowController.addKeyLoader(keyLoader);
        windowView.setWindowController(windowController);
        playerController.setPlayerService(playerService);
        playerController.setPlayerView(playerView);
        playerController.setKeyLoader(keyLoader);
        windowView.setPlayerView(playerView);
        playerView.setCreatureService(playerService);
        playerView.setPlayerController(playerController);
        playerView.setGraphics(windowService.getGraphics());


        Engine engine = new Engine();







        //Needs to be exchanged for a game state
        engine.setWindowController(windowController);
        engine.setPlayerController(playerController);

        engine.start();


        setup();
    }

    private void setup() {


    }


}
