package ciffar.services.entities.creatures;

public class EnemyService extends AbstractCreatureService {

    public EnemyService(float x, float y) {
        super(x,y,25,25,1,1f);
        collisionBox.x = 6;
        collisionBox.y = 10;
        collisionBox.width = 15;
        collisionBox.height = 15;
    }

}
