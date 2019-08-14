package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.BoxService;
import ciffar.views.entities.objects.BoxView;

public class BoxController extends AbstractObjectController {

    private BoxService boxService;
    private BoxView boxView;

    @Override
    public void init() {
        boxView.init();
    }

    @Override
    public float getBase() {
        return boxService.getY() + boxService.getEntityHeight();
    }

    public void setBoxService(BoxService boxService) {
        this.boxService = boxService;
        this.boxService.getCollisionBox().setBounds(2,7,23,18);
    }

    public void setBoxView(BoxView boxView) {
        this.boxView = boxView;
    }
}
