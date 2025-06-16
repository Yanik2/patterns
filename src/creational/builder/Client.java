package creational.builder;

public class Client {
    public Maze createMaze(MazeBuilder builder) {
        builder.createMaze();
        builder.addRoom(1);
        builder.addRoom(2);
        builder.addDoor(1, 2);

        return builder.build();
    }
}
