package structural.bridge;

public abstract class RemoteControl {
    protected final TV television;

    protected RemoteControl(TV television) {
        this.television = television;
    }

    public void turnOn() {
        television.on();
    }

    public void turnOff() {
        television.off();
    }

    public void tuneChannel() {
        television.tuneChannel();
    }
}
