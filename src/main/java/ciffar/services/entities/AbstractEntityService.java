package ciffar.services.entities;

import java.awt.*;

public abstract class AbstractEntityService implements EntityService{

    protected float x;
    protected float y;
    protected int entityWidth;
    protected int entityHeight;
    protected Rectangle collisionBox;

    public AbstractEntityService(float x, float y, int entityWidth, int entityHeight) {
        this.x = x;
        this.y = y;
        this.entityWidth = entityWidth;
        this.entityHeight = entityHeight;
        collisionBox = new Rectangle(0,0, entityWidth, entityHeight);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getEntityWidth() {
        return entityWidth;
    }

    public int getEntityHeight() {
        return entityHeight;
    }

    public Rectangle getCollisionBox() {
        return collisionBox;
    }
}
