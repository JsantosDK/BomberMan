package ciffar.views.entities.creatures;

import ciffar.graphics.Assets;
import ciffar.models.Animation;

import java.awt.image.BufferedImage;

public class EnemyView extends  AbstractCreaturesView {

    public EnemyView() {
        animationDown = new Animation(100, Assets.enemyDown);
        animationUp = new Animation(100, Assets.enemyUp);
        animationLeft = new Animation(100, Assets.enemyLeft);
        animationRight = new Animation(100, Assets.enemyRight);
    }

    protected BufferedImage currentCreatureImage() {
        return movingTowards();
    }

}
