package ciffar.services.entities.creatures;

import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.x = 7;
       collisionBox.y = 20;
       collisionBox.width = 8;
       collisionBox.height = 0;
    }

    public void getDirection(Directions directions){
        horizontalMove = 0;
        verticalMove = 0;
        switch (directions){
            case UP:
                verticalMove = -speed;
                break;
            case DOWN:
                verticalMove = speed;
                break;
            case LEFT:
                horizontalMove = -speed;
                break;
            case RIGHT:
                horizontalMove = speed;
                break;
        }
        move();
    }

}


