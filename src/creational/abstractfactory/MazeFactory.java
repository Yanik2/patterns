package creational.abstractfactory;

public class MazeFactory {
    public Maze createMaze() {
        return new Maze();
    }

    public Wall createWall() {
        return new Wall();
    }

    public Room createRoom() {
        return new Room();
    }
}
