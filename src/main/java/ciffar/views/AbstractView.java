package ciffar.views;

import java.awt.*;

public abstract class AbstractView implements View {

    public abstract void update();
    public abstract void render(Graphics graphics);
}
