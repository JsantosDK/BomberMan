package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.PilarService;
import ciffar.views.entities.objects.PilarView;

import java.awt.*;

public class PilarController extends AbstractObjectController {

    private PilarService pilarService;
    private PilarView pilarView;
    private Graphics graphics;

    public PilarController(int x, int y, Graphics graphics){
        pilarService = new PilarService(x,y);
        pilarView = new PilarView();
        pilarView.setPilarService(pilarService);
        pilarView.setGraphics(graphics);
    }

    @Override
    public void init() {
        pilarView.init();
    }

}
