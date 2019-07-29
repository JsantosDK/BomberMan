package ciffar.controllers;

import ciffar.services.WorldService;
import ciffar.views.WorldView;

public class WorldController {

    private boolean gridGenerated;
    private WorldView worldView;
    private WorldService worldService;

    public void init(){
        if (!gridGenerated) {
            worldService.init();
            gridGenerated = true;
        }
        worldView.init();
    }

    public void setWorldView(WorldView worldView) {
        this.worldView = worldView;
    }

    public void setWorldService(WorldService worldService) {
        this.worldService = worldService;
    }


}
