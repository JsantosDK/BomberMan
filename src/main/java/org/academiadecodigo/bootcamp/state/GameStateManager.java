package org.academiadecodigo.bootcamp.state;

public class GameStateManager {

    private static State currentState = null;

    public static void setCurrentState(State state) {
        currentState = state;
    }

    public static State getCurrentState() {
        return currentState;
    }

}


