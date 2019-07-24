package ciffar.services.entities.creatures;

import ciffar.services.entities.AbstractEntityService;

public abstract class AbstractCreatureService extends AbstractEntityService {

    protected final int DEFAULT_HEALTH = 10;
    protected final float DEFAULT_SPEED = 3f;
    protected static final int DEFAULT_CREATURE_WIDTH = 25;
    protected static final int DEFAULT_CREATURE_HEIGHT = 25;

    protected int health;
    protected float speed;
    protected float xMove;
    protected float yMove;

    public AbstractCreatureService(float x, float y) {
        super(x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public AbstractCreatureService(float x, float y, int entityWidth, int entityHeight, int health, float speed) {
        super(x, y, entityWidth, entityHeight);
        this.health = health;
        this.speed = speed;
        xMove = 0;
        yMove = 0;
    }

    protected void move(){
        x += xMove;
        y += yMove;
    }

}
