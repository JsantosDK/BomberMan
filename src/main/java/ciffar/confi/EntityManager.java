package ciffar.confi;

import ciffar.controllers.entities.creatures.PlayerController;
import org.academiadecodigo.bootcamp.entity.Entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EntityManager {

    private PlayerController playerController;
    private List<Entity> entities;
    private Graphics graphics;

    public EntityManager(PlayerController playerController) {
        this.playerController = playerController;
        entities = new ArrayList<>();
        //entities.add(new Pilar(100,100));
    }

    public void update(){
        for (int i = 0; i < entities.size(); i++) {
            Entity entity = entities.get(i);
            entity.update();
        }

    }

    public void render(){
        for (Entity e: entities) {
            e.render(graphics);
        }
    }

    public void addEntity(Entity entity){
        entities.add(entity);
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}
