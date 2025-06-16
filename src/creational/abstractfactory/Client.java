package creational.abstractfactory;

public class Client {

    //MazeFactory can be passed as any implementation as needed
    public Maze createMaze(MazeFactory factory) {
        final var maze = factory.createMaze();
        final var room = factory.createRoom();
        final var wall = factory.createWall();
        room.setWall(wall);
        maze.setRoom(room);

        return maze;
    }
}
