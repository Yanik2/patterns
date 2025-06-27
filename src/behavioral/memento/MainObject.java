package behavioral.memento;

public class MainObject {

    public void mainLogic() {}

    public void restore(Memento snapshot) {
        // read values from snapshot and restore state
    }

    public Memento createSnapshot() {
        return new MementoImpl("2022", 1);
    }
}
