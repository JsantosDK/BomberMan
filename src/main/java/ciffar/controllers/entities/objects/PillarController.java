package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.PillarService;
import ciffar.views.entities.objects.PillarView;

public class PillarController extends AbstractObjectController {

    private PillarService pillarService;
    private PillarView pillarView;

    @Override
    public void init() {
        pillarView.init();
    }

    @Override
    public float getBase() {
        return pillarService.getY() + pillarService.getEntityHeight();
    }

    public void setPillarService(PillarService pillarService) {
        this.pillarService = pillarService;
        this.pillarService.getCollisionBox().setBounds(1,30,25,22);
    }

    public void setPillarView(PillarView pillarView) {
        this.pillarView = pillarView;
    }
}
