package ciffar.services.entities;

public abstract class AbstractEntityService {

    protected float x;
    protected float y;
    protected int entityWidth;
    protected int entityHeight;

    public AbstractEntityService(float x, float y, int entityWidth, int entityHeight) {
        this.x = x;
        this.y = y;
        this.entityWidth = entityWidth;
        this.entityHeight = entityHeight;
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
}
