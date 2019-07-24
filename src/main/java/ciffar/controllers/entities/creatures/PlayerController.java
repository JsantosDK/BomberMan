package ciffar.controllers.entities.creatures;

import ciffar.loaders.KeyLoader;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.views.PlayerView;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public class PlayerController {

    private PlayerService playerService;
    private KeyLoader keyLoader;
    private PlayerView playerView;

    public void init(){
        keyLoader.update();
        movePlayer();
        playerView.init();
    }

    private void movePlayer(){
        if (keyLoader.isUp()){
            playerService.getDirection(Directions.UP);
        }
        if (keyLoader.isDown()){
            playerService.getDirection(Directions.DOWN);
        }
        if (keyLoader.isLeft()){
            playerService.getDirection(Directions.LEFT);
        }
        if (keyLoader.isRight()){
            playerService.getDirection(Directions.RIGHT);
        }
    }

    public void setKeyLoader(KeyLoader keyLoader) {
        this.keyLoader = keyLoader;
    }

    public float getX(){
        return playerService.getX();
    }

    public float getY(){
        return playerService.getY();
    }

    public int playerWidth(){
        return playerService.getEntityWidth();
    }

    public int playerHeight(){
        return playerService.getEntityHeight();
    }

    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }

    public void setPlayerView(PlayerView playerView) {
        this.playerView = playerView;
    }
}
