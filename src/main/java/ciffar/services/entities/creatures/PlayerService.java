package ciffar.services.entities.creatures;

import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.x = 7;
       collisionBox.y = 20;
       collisionBox.width = 8;
       collisionBox.height = 3;
    }

    public void getDirection(Directions directions){
        xMove = 0;
        yMove = 0;
        switch (directions){
            case UP:
                yMove = -speed;
                break;
            case DOWN:
                yMove = speed;
                break;
            case LEFT:
                xMove = -speed;
                break;
            case RIGHT:
                xMove = speed;
                break;
        }
        move();
    }

}


