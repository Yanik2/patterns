package creational.builder;

public class SimpleMazeBuilder extends MazeBuilder {
    private Maze maze;

    @Override
    public void createMaze() {
        this.maze = new Maze();
    }

    @Override
    public void addRoom(int roomNum) {
        maze.setRoom(new Room());
    }

    @Override
    public void addDoor(int roomFrom, int roomTo) {
        maze.setDoor(new Door());
    }

    @Override
    public Maze build() {
        return this.maze;
    }
}
