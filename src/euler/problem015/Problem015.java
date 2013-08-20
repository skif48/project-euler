package euler.problem015;

import euler.common.Direction;
import euler.common.Point;
import euler.common.Problem;

import java.util.ArrayList;
import java.util.List;

public class Problem015 implements Problem {

    private static final Direction[] DIRECTIONS = {Direction.RIGHT, Direction.DOWN};

    private final long size;

    public Problem015(final long size) {
        this.size = size;
    }

    @Override
    public long solve() {
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(0, 0));

        while (true) {
            final List<Point> newPoints = calculateNewPoints(points);
            System.out.println(newPoints.size());

            final Point firstPoint = newPoints.get(0);
            System.out.println(firstPoint);

            if (isFinishPoint(firstPoint)) {
                return newPoints.size();
            }

            points = newPoints;
        }
    }

    private boolean isFinishPoint(final Point point) {
        return point.x == this.size - 1 && point.y == this.size - 1;
    }

    private List<Point> calculateNewPoints(final List<Point> points) {
        final List<Point> newPoints = new ArrayList<Point>();

        for (final Point current : points) {
            List<Point> newPointsFromCurrent = calculateNewPointsFromCurrent(current);

            newPoints.addAll(newPointsFromCurrent);
        }

        return newPoints;
    }

    private List<Point> calculateNewPointsFromCurrent(final Point current) {
        final List<Point> points = new ArrayList<Point>();

        for (final Direction direction : DIRECTIONS) {
            final int y = current.y + direction.dy;
            final int x = current.x + direction.dx;

            final Point newPoint = new Point(x, y);

            if (isValid(newPoint)) {
                points.add(newPoint);
            }
        }

        return points;
    }

    private boolean isValid(final Point point) {
        return point.x >= 0 && point.x < this.size && point.y >= 0 && point.y < this.size;
    }

}
