package structural.proxy;

public class ProxySubject implements Subject {
    private Subject realSubject;

    @Override
    public void drawImage() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        realSubject.drawImage();
    }

    @Override
    public int getImageSize() {
        return 10;
    }
}
