package ciffar.services.entities.creatures;

public class EnemyService extends AbstractCreatureService {

    public EnemyService(float x, float y) {
        super(x,y,25,25,1,1f);
        collisionBox.setBounds(6,10,15,15);
    }

}
