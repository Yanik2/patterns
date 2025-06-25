package structural.proxy;

public class Client {

    public void doSmth(Subject subject) {
        subject.getImageSize();
        subject.drawImage();
    }
}
