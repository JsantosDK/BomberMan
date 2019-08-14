package ciffar.controllers.entities.creatures;

import ciffar.services.entities.creatures.EnemyService;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class EnemyController extends AbstractCreatureController  {

    private EnemyService enemyService;

    public EnemyController() {
        pointTowardsDirection = Directions.DOWN;
        moving = false;
    }

    public void init(){
        moveCreature();
        view.init();
    }

    @Override
    protected void moveCreature() {
        double directionToMove = Math.random();
        if (directionToMove < 0.25){
            pointTowardsDirection = Directions.UP;
            enemyService.getDirection(Directions.UP);
        } else if (directionToMove < 0.5){
            pointTowardsDirection = Directions.DOWN;
            enemyService.getDirection(Directions.DOWN);
        } else if (directionToMove < 0.75){
            pointTowardsDirection = Directions.LEFT;
            enemyService.getDirection(Directions.LEFT);
        } else {
            pointTowardsDirection = Directions.RIGHT;
            enemyService.getDirection(Directions.RIGHT);
        }
    }

    public void setEnemyService(EnemyService enemyService) {
        this.enemyService = enemyService;
    }

    @Override
    public float getBase() {
        return enemyService.getY() + enemyService.getEntityHeight();
    }

    @Override
    public float getY() {
        return enemyService.getY();
    }
}
