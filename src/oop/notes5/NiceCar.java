package oop.notes5;

public class NiceCar {
    private Engine engine;
    private final Media player = new CDPlayer();

    private Brake brake;
    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

    void stop(){
        engine.stop();
    }

    void acc(){
        engine.acc();
    }

    void startCD(){
        player.start();
    }

    void stopCD(){
        player.stop();
    }

    void upgradeEngine(){
        this.engine = new ElectricEngine();
    }


}
