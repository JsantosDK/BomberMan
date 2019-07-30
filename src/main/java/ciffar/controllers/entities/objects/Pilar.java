package ciffar.controllers.entities.objects;

import ciffar.controllers.entities.StaticEntity;
import ciffar.graphics.Assets;

import java.awt.*;

public class Pilar extends StaticEntity {

    public Pilar(float x, float y) {
        super(x, y, Assets.SPRITE_WIDTH, Assets.SPRITE_HEIGHT * 2);
    }

    public void update(){

    }

    public void render(Graphics graphics){
        graphics.drawImage(Assets.pilars[0], (int) x, (int) y, entityWidth, entityHeight, null);
    }


}
