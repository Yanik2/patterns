package behavioral.chainofresponsibility;

public interface Handler {
    void handle(Request request);
    boolean isSupported(Request request);
}
