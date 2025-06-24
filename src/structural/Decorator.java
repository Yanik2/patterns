package structural;

public class Decorator {
    private Decorator component;

    void doSmth() {
        if (component != null) {
            component.doSmth();
        }
        
        //doSmth

        return;
    }
}
