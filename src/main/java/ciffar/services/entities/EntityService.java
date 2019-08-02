package ciffar.services.entities;

import java.awt.*;

public interface EntityService {

    float getX();
    float getY();
    int getEntityWidth();
    int getEntityHeight();
    Rectangle getCollisionBox();

}
