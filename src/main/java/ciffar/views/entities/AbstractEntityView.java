package ciffar.views.entities;

import java.awt.*;

public abstract class AbstractEntityView implements View {

    protected Graphics graphics;

    protected abstract void render(Graphics graphics);

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

}
