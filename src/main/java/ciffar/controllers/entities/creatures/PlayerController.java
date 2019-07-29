package ciffar.controllers.entities.creatures;

import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.services.WorldService;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.entities.PlayerView;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerController {

    private PlayerService playerService;
    private WorldService worldService;
    private KeyLoader keyLoader;
    private PlayerView playerView;
    private Directions pointTowardsDirection;
    private boolean moving;

    public PlayerController() {
        pointTowardsDirection = Directions.DOWN;
        moving = false;
    }

    public void init(){
        keyLoader.update();
        if (keyLoader.isInUse()) {
            moving = true;
            movePlayer();
        } else {moving = false;}
        playerView.init();
    }

    private void movePlayer(){
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

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }

    public void setPlayerView(PlayerView playerView) {
        this.playerView = playerView;
    }

}
