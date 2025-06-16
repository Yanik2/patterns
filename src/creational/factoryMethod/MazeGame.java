package creational.factoryMethod;

public class MazeGame {
    public Maze createMaze() {
        final var maze = makeMaze();

        final var room1 = makeRoom();
        final var room2 = makeRoom();

        final var wall1 = makeWall();
        final var wall2 = makeWall();
        final var wall3 = makeWall();
        final var wall4 = makeWall();

        room1.setWall(wall1);
        room1.setWall(wall2);
        room2.setWall(wall3);
        room2.setWall(wall4);

        maze.setRoom(room1);
        maze.setRoom(room2);

        return maze;
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom() {
        return new Room();
    }

    public Wall makeWall() {
        return new Wall();
    }

}
