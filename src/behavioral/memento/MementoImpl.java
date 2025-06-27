package behavioral.memento;

public class MementoImpl implements Memento {
    private final String date;
    private final int version;

    public MementoImpl(String date, int version) {
        this.date = date;
        this.version = version;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public int getVersion() {
        return this.version;
    }
}
