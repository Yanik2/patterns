package behavioral.mediator;

import java.util.List;

public class Mediator {
    private List<Colleague> colleagues;

    public void updateState(Colleague colleague, Message message) {
        for (Colleague c : colleagues) {
            //doSmth
        }
    }
}
