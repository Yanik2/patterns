package structural.bridge;

public class BasicRemote extends RemoteControl {

    public BasicRemote(TV tv) {
        super(tv);
    }

    public void turnOn() {
        super.turnOn();
    }

    public void turnOff() {
        super.turnOff();
    }

    public void tuneChannel() {
        super.tuneChannel();
    }
}
