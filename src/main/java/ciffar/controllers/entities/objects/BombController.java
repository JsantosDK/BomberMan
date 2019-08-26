package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.BombService;

public class BombController extends AbstractObjectController {

    private BombService bombService;

    @Override
    public void init() {
        view.init();
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
        this.bombService.getCollisionBox().setBounds(5, 4, 16, 17);
    }

    public void setLocation(float x, float y) {
        bombService.setX(x);
        bombService.setY(y);
    }

}
