package model;

public class Point {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 24;

    private final int x;
    private final int y;

    public Point(int x, int y) {
        checkGreaterThenMax(x, y);
        checkLessThenMin(x, y);

        this.x = x;
        this.y = y;
    }

    public double calculateWith(Point point) {
        return Math.sqrt(
                Math.pow(this.x - point.x, 2)
                        + Math.pow(this.y - point.y, 2)
        );
    }

    public boolean matchX(Point point) {
        return this.x == point.x;
    }

    public boolean matchY(Point point) {
        return this.y == point.y;
    }

    private void checkLessThenMin(int x, int y) {
        if (x > MAX_VALUE || y > MAX_VALUE) {
            throw new IllegalArgumentException();
        }
    }

    private void checkGreaterThenMax(int x, int y) {
        if (x < MIN_VALUE || y < MIN_VALUE) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
