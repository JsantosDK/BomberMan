package org.academiadecodigo.bootcamp.entity;

import org.academiadecodigo.bootcamp.Handler;

import java.awt.*;

public abstract class Entity {

    protected float x;
    protected float y;
    protected int width;
    protected int height;
    protected Handler handler;

    public Entity(float x, float y, int width, int height, Handler handler) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.handler = handler;
    }

    public abstract void update();

    public abstract void render(Graphics graphics);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
