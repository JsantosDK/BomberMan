package ciffar.services.entities.creatures;

import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.x = 6;
       collisionBox.y = 10;
       collisionBox.width = 15;
       collisionBox.height = 15;
    }



}


