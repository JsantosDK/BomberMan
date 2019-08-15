package ciffar.services.entities.creatures;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.x = 6;
       collisionBox.y = 10;
       collisionBox.width = 15;
       collisionBox.height = 15;
    }



}


