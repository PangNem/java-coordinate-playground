package domain;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x) {
        this(x, 0);
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isMatchX(int x) {
        return this.x == x;
    }

    public boolean isMatchY(int y) {
        return this.y == y;
    }

}
