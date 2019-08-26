package ciffar.factories;

import ciffar.controllers.entities.creatures.EnemyController;
import ciffar.controllers.entities.creatures.PlayerController;
import ciffar.controllers.entities.objects.BoxController;
import ciffar.controllers.entities.objects.PillarController;
import ciffar.graphics.Assets;
import ciffar.loaders.KeyLoader;
import ciffar.models.EntityManager;
import ciffar.services.WorldService;
import ciffar.services.entities.creatures.EnemyService;
import ciffar.services.entities.creatures.PlayerService;
import ciffar.services.entities.objects.BoxService;
import ciffar.services.entities.objects.PillarService;
import ciffar.views.entities.creatures.EnemyView;
import ciffar.views.entities.creatures.PlayerView;
import ciffar.views.entities.objects.BoxView;
import ciffar.views.entities.objects.PillarView;

import java.awt.*;

public class EntityFactory {

    private EntityManager entityManager;
    private WorldService worldService;
    private KeyLoader keyLoader;

    public void createObject(ObjectTypes objectTypes, int x, int y) {
        switch (objectTypes) {
            case BOX:
                createBox(x, y);
                break;
            case PILLAR:
                createPillar(x, y);
                break;
            case ENEMY:
                createEnemy(x, y);
                break;
            case PLAYER:
                createPlayer(x, y);
        }
    }

    private void createBox(int x, int y) {
        BoxController boxController = new BoxController();
        BoxService boxService = new BoxService(x, y);
        BoxView boxView = new BoxView();

        boxController.setBoxService(boxService);
        boxController.setBoxView(boxView);
        boxView.setGraphics(entityManager.getGraphics());
        boxView.setBoxService(boxService);

        entityManager.addEntity(boxController, boxService);
    }

    private void createPillar(int x, int y) {
        PillarController pillarController = new PillarController();
        PillarService pillarService = new PillarService(x, y);
        PillarView pillarView = new PillarView();

        pillarController.setPillarService(pillarService);
        pillarController.setPillarView(pillarView);
        pillarView.setGraphics(entityManager.getGraphics());
        pillarView.setPillarService(pillarService);

        entityManager.addEntity(pillarController, pillarService);
    }

    private void createEnemy(int x, int y) {
        EnemyController enemyController = new EnemyController();
        EnemyService enemyService = new EnemyService(x, y);
        EnemyView enemyView = new EnemyView();

        enemyController.setEnemyService(enemyService);
        enemyController.setView(enemyView);
        enemyService.setWorldService(worldService);
        enemyView.setGraphics(entityManager.getGraphics());
        enemyView.setCreatureController(enemyController);
        enemyView.setCreatureService(enemyService);

        entityManager.addEntity(enemyController, enemyService);
    }

    private void createPlayer(int x, int y) {
        PlayerService playerService = new PlayerService(x, y);
        PlayerController playerController = new PlayerController();
        PlayerView playerView = new PlayerView();

        playerController.setPlayerService(playerService);
        playerController.setView(playerView);
        playerService.setWorldService(worldService);
        playerView.setCreatureController(playerController);
        playerView.setCreatureService(playerService);
        playerView.setGraphics(entityManager.getGraphics());

        playerController.setEntityManager(entityManager);
        playerController.setKeyLoader(keyLoader);
        playerController.setupBomb();

        entityManager.addEntity(playerController, playerService);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }

    public void setKeyLoader(KeyLoader keyLoader) {
        this.keyLoader = keyLoader;
    }
}
