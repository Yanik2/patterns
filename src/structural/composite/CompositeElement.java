package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element {
    private final List<Element> elements;

    public CompositeElement() {
        this.elements = new ArrayList<>();
    }

    public void add(Element e) {
        elements.add(e);
    }

    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public void run() {
        for (Element e : elements) {
            e.run();
        }
    }

    @Override
    public void execute() {
        for (Element e : elements) {
            e.execute();
        }
    }
}
