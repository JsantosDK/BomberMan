package ciffar.confi;

import ciffar.controllers.entities.EntityController;
import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.models.CollisionDetector;
import ciffar.services.entities.EntityService;
import ciffar.services.entities.creatures.AbstractCreatureService;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EntityManager {

    private List<EntityController> entityControllers;
    private List<EntityService> entityServices;
    private CollisionDetector collisionDetector;
    private Comparator<EntityController> renderSort;

    private Graphics graphics;

    public EntityManager(PlayerController playerController) {
        collisionDetector = new CollisionDetector();
        entityControllers = new ArrayList<>();
        entityServices = new ArrayList<>();
        setupManager(playerController);
    }

    public void update(){
        for (int i = 0; i < entityControllers.size(); i++) {
            EntityController entity = entityControllers.get(i);
            entity.init();
        }
        entityControllers.sort(renderSort);

    }

    public void init(){
        for (EntityController e: entityControllers) {
            e.init();
        }
    }

    public void addEntity(EntityController entityController, EntityService entityService){
        entityControllers.add(entityController);
        entityServices.add(entityService);
        if (entityService instanceof AbstractCreatureService){
            AbstractCreatureService creatureService = (AbstractCreatureService) entityService;
            creatureService.setCollisionDetector(collisionDetector);
        }
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }

    private void setupManager(PlayerController playerController){
        renderSort = new Comparator<EntityController>() {
            @Override
            public int compare(EntityController entity1, EntityController entity2) {
                if (entity1.getBase() < entity2.getBase()) {
                    return -1;
                }
                return 1;
            }
        };
        collisionDetector.setEntityList(entityServices);
        entityControllers.add(playerController);
    }

}
