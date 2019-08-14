package ciffar.services.entities.creatures;

import ciffar.models.CollisionDetector;
import ciffar.graphics.Assets;
import ciffar.services.WorldService;
import ciffar.services.entities.AbstractEntityService;
import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public abstract class AbstractCreatureService extends AbstractEntityService {

    protected final int DEFAULT_HEALTH = 10;
    protected final float DEFAULT_SPEED = 1f;
    protected static final int DEFAULT_CREATURE_WIDTH = 25;
    protected static final int DEFAULT_CREATURE_HEIGHT = 25;

    protected int health;
    protected float speed;
    protected float horizontalMove;
    protected float verticalMove;
    protected WorldService worldService;
    private CollisionDetector collisionDetector;

    public AbstractCreatureService(float x, float y) {
        super(x, y, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        horizontalMove = 0;
        verticalMove = 0;
    }

    public AbstractCreatureService(float x, float y, int entityWidth, int entityHeight, int health, float speed) {
        super(x, y, entityWidth, entityHeight);
        this.health = health;
        this.speed = speed;
        horizontalMove = 0;
        verticalMove = 0;
    }



    protected void move() {
        if (horizontalMove > 0 && !collisionDetector.crash(this) ) {
            if (!collisionWithTile(xCollisionLimit(collisionBox.width), (int) ((y + collisionBox.y) / Assets.SPRITE_HEIGHT))) {
                x += horizontalMove;
            }
        }
        if (horizontalMove < 0 && !collisionDetector.crash(this)){
            if (!collisionWithTile(xCollisionLimit(0), (int) ((y + collisionBox.y) / Assets.SPRITE_HEIGHT))) {
                x += horizontalMove;
            }
        }
        if (verticalMove > 0 && !collisionDetector.crash(this)) {
            if (!collisionWithTile((int) ((x + collisionBox.x) / Assets.SPRITE_WIDTH), yCollisionLimit(collisionBox.height))) {
                y += verticalMove;
            }
        }
        if (verticalMove < 0 && !collisionDetector.crash(this)) {
            if (!collisionWithTile((int) ((x + collisionBox.x) / Assets.SPRITE_WIDTH), yCollisionLimit(0))) {
                y += verticalMove;
            }
        }
    }

    private int xCollisionLimit(int collisionBoxWidth){
        return (int) (x + horizontalMove + collisionBox.x + collisionBoxWidth) / Assets.SPRITE_WIDTH;
    }

    private int yCollisionLimit( int collisionBoxHeight){
        return (int) (y + verticalMove + collisionBox.y + collisionBoxHeight) / Assets.SPRITE_HEIGHT;
    }

    private boolean collisionWithTile(int x, int y) {
        return worldService.getWorldGrid()[y][x].isSolid();
    }

    public float getHorizontalMove() {
        return horizontalMove;
    }

    public float getVerticalMove() {
        return verticalMove;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public void getDirection(Directions directions){
        horizontalMove = 0;
        verticalMove = 0;
        switch (directions){
            case UP:
                verticalMove = -speed;
                break;
            case DOWN:
                verticalMove = speed;
                break;
            case LEFT:
                horizontalMove = -speed;
                break;
            case RIGHT:
                horizontalMove = speed;
                break;
        }
        move();
    }

}
