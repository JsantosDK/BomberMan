package ciffar.controllers.entities.objects;

import ciffar.services.entities.objects.BombService;

public class BombController extends AbstractObjectController {

    private BombService bombService;
    private boolean using;
    private int timeOnScreen;

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
        this.bombService.getCollisionBox().setBounds(4, 2, 18, 18);
    }

    public void setLocation(int x, int y) {
        bombService.setX(x);
        bombService.setY(y);
    }

    public boolean isUsing() {
        return using;
    }

}
