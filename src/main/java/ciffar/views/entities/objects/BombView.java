package ciffar.views.entities.objects;

import ciffar.graphics.Assets;
import ciffar.services.entities.objects.BombService;

import java.awt.*;

public class BombView extends AbstractObjectsView {

    private BombService bombService;

    @Override
    public void init() {
        render(graphics);
    }

    @Override
    protected void render(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillRect((int)(bombService.getX() + bombService.getCollisionBox().x), (int) (bombService.getY() + bombService.getCollisionBox().y), (int) bombService.getCollisionBox().width, (int) bombService.getCollisionBox().height);
        graphics.drawImage(Assets.bomb[0], (int) bombService.getX(), (int) bombService.getY(), bombService.getEntityWidth(), bombService.getEntityHeight(), null);
    }

    public void setBombService(BombService bombService) {
        this.bombService = bombService;
    }
}
