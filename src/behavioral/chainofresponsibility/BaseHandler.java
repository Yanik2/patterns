package behavioral.chainofresponsibility;

public class BaseHandler implements Handler {
    private final Handler successor;

    public BaseHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handle(Request request) {
        if (successor != null) {
            successor.handle(request);
        } else {
            // doSmth by default
        }
    }

    @Override
    public boolean isSupported(Request request) {
        return true;
    }
}
