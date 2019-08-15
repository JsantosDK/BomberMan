package ciffar.controllers.entities.creatures;

import ciffar.controllers.entities.AbstractEntityController;
import ciffar.models.Directions;

public abstract class AbstractCreatureController extends AbstractEntityController {

    protected boolean moving;
    protected Directions pointTowardsDirection;

    protected abstract void moveCreature();

    public boolean isMoving() {
        return moving;
    }

    public Directions getPointTowardsDirection() {
        return pointTowardsDirection;
    }
}
