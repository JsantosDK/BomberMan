package ciffar.services.entities.creatures;

import ciffar.graphics.Assets;
import ciffar.services.WorldService;
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
    protected WorldService worldService;

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

    protected void move() {
        if (xMove > 0) {
            int tx = (int) (x + xMove + collisionBox.x + collisionBox.width) / Assets.SPRITE_WIDTH;
            if (!collisionWithTile((int) ((y + collisionBox.y) / Assets.SPRITE_WIDTH), tx)) {
                x += xMove;
            }
        }
        if (xMove < 0){
            int tx = (int) (x + xMove + collisionBox.x) / Assets.SPRITE_WIDTH;
            if (!collisionWithTile((int) ((y + collisionBox.y) / Assets.SPRITE_WIDTH), tx)) {
                x += xMove;
            }
        }
        if (yMove > 0) {
            int ty = (int) (y + yMove + collisionBox.y + collisionBox.height) / Assets.SPRITE_HEIGHT;
            if (!collisionWithTile(ty,(int) ((x + collisionBox.x) / Assets.SPRITE_HEIGHT))) {
                y += yMove;
            }
        }
        if (yMove < 0) {
            int ty = (int) (y + yMove + collisionBox.y) / Assets.SPRITE_HEIGHT;
            if (!collisionWithTile(ty,(int) ((x + collisionBox.x) / Assets.SPRITE_HEIGHT))) {
                y += yMove;
            }
        }



    }

    private boolean collisionWithTile(int x, int y) {
        return worldService.getWorldGrid()[x][y].isSolid();
    }

    public float getxMove() {
        return xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }
}
