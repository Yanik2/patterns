package creational.abstractfactory;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Room createRoom() {
        return new BombedRoom();
    }

    @Override
    public Wall createWall() {
        return new BombedWall();
    }
}
