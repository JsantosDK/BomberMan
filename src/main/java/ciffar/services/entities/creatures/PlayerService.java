package ciffar.services.entities.creatures;

import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.x = 6;
       collisionBox.y = 10;
       collisionBox.width = 13;
       collisionBox.height = 14;
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


