package ciffar.services.entities.objects;

import ciffar.graphics.Assets;

public class PilarService extends AbstractObjectService {

    public PilarService(float x, float y) {
        super(x, y, Assets.SPRITE_WIDTH, Assets.SPRITE_HEIGHT * 2);
        collisionBox.x = 1;
        collisionBox.y = 37;
        collisionBox.width = 25;
        collisionBox.height = 15;
    }



}
