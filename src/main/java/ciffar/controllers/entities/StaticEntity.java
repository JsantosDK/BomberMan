package ciffar.controllers.entities;

import ciffar.services.entities.AbstractEntityService;

public abstract class StaticEntity extends AbstractEntityService {

    public StaticEntity(float x, float y, int entityWidth, int entityHeight) {
        super(x, y, entityWidth, entityHeight);
    }
}
