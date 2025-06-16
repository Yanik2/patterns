package creational.builder;

public abstract class MazeBuilder {
    public void createMaze() {}
    public void addRoom(int num) {}
    public void addDoor(int roomFrom, int roomTo) {}

    public abstract Maze build();
}
