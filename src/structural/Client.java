package structural;

//This class expects webClient to be particular interface with particular methods,
// but webClientAdaptee has another methods, so WebClientAdapter adapts those to required interface
public class Client {
    private final WebClient webClient;

    public Client(WebClient webClient) {
        this.webClient = webClient;
    }

    void operation() {
        //do smth
        webClient.get();
        webClient.post();
    }
}
