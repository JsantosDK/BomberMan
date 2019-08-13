package ciffar.views.entities.objects;

import ciffar.graphics.Assets;
import ciffar.services.entities.objects.PillarService;

import java.awt.*;

public class PillarView extends AbstractObjectsView {

    private PillarService pillarService;

    @Override
    public void init() {
        render(graphics);
    }

    @Override
    protected void render(Graphics graphics) {
        //graphics.setColor(Color.RED);
        //graphics.fillRect((int)(pillarService.getX() + pillarService.getCollisionBox().x), (int) (pillarService.getY() + pillarService.getCollisionBox().y), (int) pillarService.getCollisionBox().width, (int) pillarService.getCollisionBox().height);
        graphics.drawImage(Assets.pillar, (int) pillarService.getX(), (int) pillarService.getY(), pillarService.getEntityWidth(), pillarService.getEntityHeight(), null);
    }

    public void setPillarService(PillarService pillarService) {
        this.pillarService = pillarService;
    }

}
