package ciffar.confi;

import ciffar.controllers.entities.EntityController;
import ciffar.controllers.entities.creatures.PlayerController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {

    private List<EntityController> entities;
    private Graphics graphics;

    public EntityManager(PlayerController playerController) {
        entities = new ArrayList<>();
        entities.add(playerController);

    }

    public void update(){
        for (int i = 0; i < entities.size(); i++) {
            EntityController entity = entities.get(i);
            entity.init();
        }

    }

    public void render(){
        for (EntityController e: entities) {
            e.init();
        }
    }

    public void addEntity(EntityController entity){
        entities.add(entity);
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Graphics getGraphics() {
        return graphics;
    }
}
