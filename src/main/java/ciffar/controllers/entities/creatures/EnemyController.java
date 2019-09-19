package ciffar.controllers.entities.creatures;

import ciffar.services.entities.creatures.EnemyService;
import ciffar.models.Directions;

public class EnemyController extends AbstractCreatureController  {

    private EnemyService enemyService;
    private double stepCounter;
    private boolean correctionOngoing;

    public EnemyController() {
        pointTowardsDirection = Directions.DOWN;
        moving = false;
    }

    public void init(){
        if (stepCounter != 0) {
            stepCounter--;
            enemyService.moveTowardsDirection(pointTowardsDirection);
        } else if (enemyService.getX() % 25 != 0 || enemyService.getY()%25 != 0){
                correctionOngoing = true;
                correctMovement();
        }  else {
            stepCounter = 25 * (int) (Math.random() * 3 )+ 1;
            moveCreature();
        }
        view.init();
    }

    @Override
    protected void moveCreature() {
        if (!correctionOngoing) {
            double directionToMove = Math.random();
            if (directionToMove < 0.25) {
                pointTowardsDirection = Directions.UP;
                enemyService.moveTowardsDirection(Directions.UP);
            } else if (directionToMove < 0.5) {
                pointTowardsDirection = Directions.DOWN;
                enemyService.moveTowardsDirection(Directions.DOWN);
            } else if (directionToMove < 0.75) {
                pointTowardsDirection = Directions.LEFT;
                enemyService.moveTowardsDirection(Directions.LEFT);
            } else {
                pointTowardsDirection = Directions.RIGHT;
                enemyService.moveTowardsDirection(Directions.RIGHT);
            }
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

    private void correctMovement(){
        switch (pointTowardsDirection){
            case DOWN:
                enemyService.moveTowardsDirection(Directions.UP);
                break;
            case UP:
                enemyService.moveTowardsDirection(Directions.DOWN);
                break;
            case LEFT:
                enemyService.moveTowardsDirection(Directions.RIGHT);
                break;
            case RIGHT:
                enemyService.moveTowardsDirection(Directions.LEFT);
                break;
        }
        if (enemyService.getY() % 25 == 0 && enemyService.getX() % 25 == 0){
            correctionOngoing = false;
        }
    }
}
