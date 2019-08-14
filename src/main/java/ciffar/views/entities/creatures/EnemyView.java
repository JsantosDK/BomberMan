package ciffar.views.entities.creatures;

import ciffar.controllers.entities.creatures.EnemyController;
import ciffar.graphics.Assets;
import ciffar.models.Animation;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

import java.awt.image.BufferedImage;

public class EnemyView extends  AbstractCreaturesView {

    private EnemyController enemyController;

    public EnemyView() {
        animationDown = new Animation(100, Assets.enemyDown);
        animationUp = new Animation(100, Assets.enemyUp);
        animationLeft = new Animation(100, Assets.enemyLeft);
        animationRight = new Animation(100, Assets.enemyRight);
    }

    protected BufferedImage currentCreatureImage() {
        if (enemyController.isMoving()){
            return movingTowards();
        }
        return pointTowards();
    }

    private BufferedImage pointTowards() {
        if (enemyController.getPointTowardsDirection() == Directions.DOWN) {
            return animationDown.getBaseFrame();
        }
        if (enemyController.getPointTowardsDirection() == Directions.UP) {
            return animationUp.getBaseFrame();
        }
        if (enemyController.getPointTowardsDirection() == Directions.LEFT) {
            return animationLeft.getBaseFrame();
        }
        return animationRight.getBaseFrame();
    }

    public void setEnemyController(EnemyController enemyController) {
        this.enemyController = enemyController;
    }
}
