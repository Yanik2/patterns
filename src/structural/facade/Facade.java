package structural.facade;

public class Facade {
    private ServiceOne serviceOne;
    private ServiceTwo serviceTwo;

    public void doSmth() {
        serviceOne.doServiceOneLogic();
        serviceTwo.doServiceTwoLogic();
    }
}
