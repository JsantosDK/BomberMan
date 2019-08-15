package ciffar.controllers.entities.creatures;

import ciffar.controllers.entities.objects.BombController;
import ciffar.loaders.KeyLoader;
import ciffar.models.EntityManager;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.models.Directions;
import ciffar.services.entities.objects.BombService;
import ciffar.views.entities.objects.BombView;

public class PlayerController extends AbstractCreatureController {

    private PlayerService playerService;
    private KeyLoader keyLoader;
    private BombController bombController;
    private EntityManager entityManager;
    private boolean bombInUse;

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
            bombController.setLocation( (int) playerService.getX(), (int )playerService.getY());
            bombController.init();
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

    public void setupBomb(){
        bombController = new BombController();
        BombService bombService = new BombService(0,0);
        BombView bombView = new BombView();

        bombView.setBombService(bombService);
        bombView.setGraphics(entityManager.getGraphics());
        bombController.setBombService(bombService);
        bombController.setView(bombView);

        entityManager.addEntity(bombController, bombService);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
