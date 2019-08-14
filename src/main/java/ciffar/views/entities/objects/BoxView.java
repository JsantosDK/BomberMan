package ciffar.views.entities.objects;

import ciffar.graphics.Assets;
import ciffar.services.entities.objects.BoxService;

import java.awt.*;

public class BoxView extends AbstractObjectsView{

    private BoxService boxService;

    @Override
    public void init() {
        render(graphics);
    }

    @Override
    protected void render(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillRect((int)(boxService.getX() + boxService.getCollisionBox().x), (int) (boxService.getY() + boxService.getCollisionBox().y), (int) boxService.getCollisionBox().width, (int) boxService.getCollisionBox().height);
        graphics.drawImage(Assets.box, (int) boxService.getX(), (int) boxService.getY(), boxService.getEntityWidth(), boxService.getEntityHeight(), null);
    }

    public void setBoxService(BoxService boxService) {
        this.boxService = boxService;
    }
}
