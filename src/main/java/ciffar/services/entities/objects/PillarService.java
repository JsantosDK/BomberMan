package ciffar.services.entities.objects;

import ciffar.graphics.Assets;

public class PillarService extends AbstractObjectService {

    public PillarService(float x, float y) {
        super(x+1, y - 3, Assets.SPRITE_WIDTH, Assets.SPRITE_HEIGHT * 2);
    }

}
