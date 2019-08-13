package ciffar.models;

import ciffar.services.entities.EntityService;
import ciffar.services.entities.creatures.AbstractCreatureService;

import java.awt.*;
import java.util.List;

public class CollisionDetector {

    private List<EntityService> entityList;

    public boolean crash(AbstractCreatureService creatureService){
        for (EntityService entity: entityList) {
            if (entity.getCollisionBox().equals(creatureService.getCollisionBox())){
                continue;
            }
            if (gridCollisionBox(creatureService, creatureService.getHorizontalMove(),creatureService.getVerticalMove()).intersects(gridCollisionBox(entity))){
                return true;
            }
        }
        return false;
    }

    public void setEntityList(List<EntityService> entityList) {
        this.entityList = entityList;
    }

    private Rectangle gridCollisionBox(EntityService entity){
        return new Rectangle((int) entity.getX() + entity.getCollisionBox().x, (int)entity.getY() + entity.getCollisionBox().y, entity.getCollisionBox().width, entity.getCollisionBox().height);
    }

    private Rectangle gridCollisionBox(EntityService entity, float horizontalMove, float verticalMove){
        return new Rectangle((int) (entity.getX() + entity.getCollisionBox().x + horizontalMove), (int) (entity.getY() + entity.getCollisionBox().y + verticalMove), entity.getCollisionBox().width, entity.getCollisionBox().height);
    }

}
