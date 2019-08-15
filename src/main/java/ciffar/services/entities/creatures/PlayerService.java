package ciffar.services.entities.creatures;

public class PlayerService extends AbstractCreatureService {

    public PlayerService(float x, float y) {
       super(x,y);
       collisionBox.setBounds(6,10,15,15);
    }



}


