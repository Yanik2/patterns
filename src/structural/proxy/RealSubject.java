package structural.proxy;

public class RealSubject implements Subject {

    @Override
    public void drawImage() {
        // doSmth
    }

    @Override
    public int getImageSize() {
        return 10;
    }
}
