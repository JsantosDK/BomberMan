package ciffar.controllers.entities;

import ciffar.views.entities.View;

public interface EntityController {

    void init();
    void setView(View view);
    float getBase();
}
