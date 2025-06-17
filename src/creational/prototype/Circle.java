package creational.prototype;

public class Circle implements Prototype {
    private final int radius;
    private final String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    private Circle(Circle other) {
        this(other.radius, other.color);
    }

    @Override
    public Prototype clonePrototype() {
        return new Circle(this);
    }
}
