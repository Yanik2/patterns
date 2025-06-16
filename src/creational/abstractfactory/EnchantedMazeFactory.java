package creational.abstractfactory;

public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Room createRoom() {
        return new EnchantedRoom();
    }
}
