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
        //this.points = new ArrayList<Point>();
        //this.points.add(new Point(0, 0));
        return 0;
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
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean isValid(final Point point) {
        return point.x >= 0 && point.x < size && point.y >= 0 && point.y < size;
    }

}
