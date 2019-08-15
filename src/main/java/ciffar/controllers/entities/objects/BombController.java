package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.BombService;
import ciffar.views.entities.objects.BombView;

public class BombController extends AbstractObjectController {

    private BombService bombService;
    private BombView bombView;

    @Override
    public void init() {
        bombView.init();
    }

    @Override
    public float getBase() {
        return bombService.getY() + bombService.getEntityHeight();
    }

    @Override
    public float getY() {
        return bombService.getY();
    }

    public void setBombService(BombService bombService) {
        this.bombService = bombService;
        this.bombService.getCollisionBox().setBounds(1,31,23,18);
    }

    public void setBombView(BombView bombView) {
        this.bombView = bombView;
    }
}
