package euler.problem011;

public enum Direction {

    UP(0, -1),
    UP_LEFT(-1, -1),
    UP_RIGHT(1, -1),
    DOWN(0, 1),
    DOWN_LEFT(-1, 1),
    DOWN_RIGHT(1, 1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    public final int dx;
    public final int dy;

    private Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

}
