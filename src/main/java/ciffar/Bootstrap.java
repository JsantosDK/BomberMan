package ciffar;

import ciffar.views.Display;

public class Bootstrap {

    private Display display;

    public Bootstrap(String tile, int windowWidth, int windowHeight) {
        display = new Display(tile, windowWidth,windowHeight);
    }


}
