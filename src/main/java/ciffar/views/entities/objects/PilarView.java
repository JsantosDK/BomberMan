package ciffar.views.entities.objects;

import ciffar.graphics.Assets;
import ciffar.services.entities.objects.PilarService;

import java.awt.*;

public class PilarView extends AbstractObjectsView {

    private PilarService pilarService;

    @Override
    public void init() {
        render(graphics);
    }

    @Override
    protected void render(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillRect((int)(pilarService.getX() + pilarService.getCollisionBox().x), (int) (pilarService.getY() + pilarService.getCollisionBox().y), (int) pilarService.getCollisionBox().width, (int) pilarService.getCollisionBox().height);
        graphics.drawImage(Assets.pilars[0], (int) pilarService.getX(), (int) pilarService.getY(), pilarService.getEntityWidth(), pilarService.getEntityHeight(), null);
    }

    public void setPilarService(PilarService pilarService) {
        this.pilarService = pilarService;
    }

}
