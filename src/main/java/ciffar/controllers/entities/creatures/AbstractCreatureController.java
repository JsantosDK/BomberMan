package ciffar.controllers.entities.creatures;

import ciffar.controllers.entities.AbstractEntityController;

import org.academiadecodigo.bootcamp.entity.creatures.Directions;

public abstract class AbstractCreatureController extends AbstractEntityController {

    protected Directions pointTowardsDirection;
    protected boolean moving;

    protected abstract void moveCreature();

}
