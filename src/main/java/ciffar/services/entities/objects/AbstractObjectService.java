package ciffar.services.entities.objects;

import ciffar.graphics.Assets;
import ciffar.services.entities.AbstractEntityService;

public abstract class AbstractObjectService extends AbstractEntityService {

    public AbstractObjectService(float x, float y, int entityWidth, int entityHeight) {
        super(x, y, entityWidth, entityHeight);
    }

    public AbstractObjectService(float x, float y) {
        super(x, y, Assets.SPRITE_WIDTH, Assets.SPRITE_HEIGHT);
    }

}
