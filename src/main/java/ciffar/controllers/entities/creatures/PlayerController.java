package ciffar.controllers.entities.creatures;

import ciffar.loaders.KeyLoader;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.models.Directions;

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
        if (keyLoader.isBomb()){
            System.out.println("Bomb placed");
        }
        view.init();
    }

    @Override
    protected void moveCreature() {
        if (keyLoader.isUp()){
            pointTowardsDirection = Directions.UP;
            playerService.moveTowardsDirection(Directions.UP);
        }
        if (keyLoader.isDown()){
            pointTowardsDirection = Directions.DOWN;
            playerService.moveTowardsDirection(Directions.DOWN);
        }
        if (keyLoader.isLeft()){
            pointTowardsDirection = Directions.LEFT;
            playerService.moveTowardsDirection(Directions.LEFT);
        }
        if (keyLoader.isRight()){
            pointTowardsDirection = Directions.RIGHT;
            playerService.moveTowardsDirection(Directions.RIGHT);
        }
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

    @Override
    public float getY() {
        return playerService.getY();
    }

}
