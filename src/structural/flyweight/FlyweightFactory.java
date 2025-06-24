package structural.flyweight;

import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> cache;

    public Flyweight lookUp(String name) {
        var value = cache.get(name);
        if (value == null) {
            value = new Flyweight() {};
            cache.put(name, value);
        }

        return value;
    }
}
