package ciffar.controllers.entities.creatures;

import ciffar.loaders.KeyLoader;
import ciffar.services.entities.creatures.PlayerService;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerController extends AbstractCreatureController {

    private PlayerService playerService;
    private KeyLoader keyLoader;

    public PlayerController() {
        pointTowardsDirection = Directions.DOWN;
        moving = false;
    }

    public void init(){
        keyLoader.update();
        if (keyLoader.isInUse()) {
            moving = true;
            moveCreature();
        } else {moving = false;}
        view.init();
    }

    @Override
    protected void moveCreature() {
        if (keyLoader.isUp()){
            pointTowardsDirection = Directions.UP;
            playerService.getDirection(Directions.UP);
        }
        if (keyLoader.isDown()){
            pointTowardsDirection = Directions.DOWN;
            playerService.getDirection(Directions.DOWN);
        }
        if (keyLoader.isLeft()){
            pointTowardsDirection = Directions.LEFT;
            playerService.getDirection(Directions.LEFT);
        }
        if (keyLoader.isRight()){
            pointTowardsDirection = Directions.RIGHT;
            playerService.getDirection(Directions.RIGHT);
        }
    }

    public Directions getPointTowardsDirection() {
        return pointTowardsDirection;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setKeyLoader(KeyLoader keyLoader) {
        this.keyLoader = keyLoader;
    }

    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public float getBase() {
        return playerService.getY() + playerService.getEntityHeight();
    }
}
