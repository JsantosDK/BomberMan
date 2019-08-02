package ciffar.models;

import ciffar.services.entities.EntityService;
import ciffar.services.entities.creatures.AbstractCreatureService;

import java.awt.*;
import java.util.List;

public class CollisionDetector {

    private List<EntityService> entityList;

    public boolean crash(AbstractCreatureService abstractCreatureService){
        for (EntityService entity: entityList) {
            if (entity.getCollisionBox().equals(abstractCreatureService.getCollisionBox())){
                continue;
            }
            if (gridCollisionBox(abstractCreatureService, abstractCreatureService.getHorizontalMove(),abstractCreatureService.getVerticalMove()).intersects(gridCollisionBox(entity))){
                return true;
            }
        }
        return false;
    }

    public void setEntityList(List<EntityService> entityList) {
        this.entityList = entityList;
    }

    private Rectangle gridCollisionBox(EntityService entityService){
        return new Rectangle((int) entityService.getX() + entityService.getCollisionBox().x, (int)entityService.getY() + entityService.getCollisionBox().y, entityService.getCollisionBox().width, entityService.getCollisionBox().height);
    }

    private Rectangle gridCollisionBox(EntityService entityService, float x, float y){
        return new Rectangle((int) (entityService.getX() + entityService.getCollisionBox().x + x), (int) (entityService.getY() + entityService.getCollisionBox().y + y), entityService.getCollisionBox().width, entityService.getCollisionBox().height);
    }

}
