package behavioral.chainofresponsibility;

public class RequestHandlerTwo extends BaseHandler {
    public RequestHandlerTwo(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Request request) {
        if (isSupported(request)) {
            //doSmth
            return;
        } else {
            super.handle(request);
        }
    }

    @Override
    public boolean isSupported(Request request) {
        //some logic for determine is request supported
        return super.isSupported(request);
    }
}
