package ciffar.controllers.entities;

import ciffar.views.entities.View;

public abstract class AbstractEntityController implements EntityController {

    protected View view;

    public void setView(View view) {
        this.view = view;
    }

}
