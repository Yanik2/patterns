package structural;

public class WebClientAdapter implements WebClient {
    private final WebClientAdaptee adaptee;

    public WebClientAdapter(WebClientAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String post() {
        return adaptee.performPost();
    }

    @Override
    public String get() {
        return adaptee.performGet();
    }
}
