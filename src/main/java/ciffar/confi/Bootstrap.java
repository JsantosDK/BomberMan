package ciffar.confi;

import ciffar.controllers.WindowController;
import ciffar.services.WindowService;
import ciffar.views.WindowView;

public class Bootstrap {

    private WindowService windowService;
    private WindowController windowController;
    private WindowView windowView;

    public Bootstrap() {
        windowService = new WindowService();
        windowController = new WindowController();
        windowView = new WindowView();
        windowController.setWindowView(windowView);
        windowController.setWindowService(windowService);
        windowView.setWindowController(windowController);








        Engine engine = new Engine();
        engine.setWindowController(windowController);


        engine.start();


        setup();
    }

    private void setup() {


    }


}
