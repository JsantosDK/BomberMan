package ciffar.confi;

public class Bootstrap {

    private WindowFrame windowFrame;
    private WindowCanvas windowCanvas;

    public Bootstrap(String tile, int windowWidth, int windowHeight) {
        windowFrame = new WindowFrame(tile, windowWidth, windowHeight);
        windowCanvas = new WindowCanvas(windowWidth, windowHeight);
        Engine engine = new Engine();
        engine.setWindowCanvas(windowCanvas);

        engine.start();


        setup();
    }

    private void setup() {
        windowFrame.getFrame().add(windowCanvas.getCanvas());
        windowFrame.getFrame().pack();


    }


}
