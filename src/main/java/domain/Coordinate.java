package domain;

public class Coordinate {

    private PositionX x;
    private PositionY y;

    public Coordinate(int x) {
        this(x, 0);
    }

    public Coordinate(int x, int y) {
        this.x = new PositionX(x);
        this.y = new PositionY(y);
    }

    public boolean isMatchX(Position position) {
        return x.equals(position);
    }

    public boolean isMatchY(Position position) {
        return y.equals(position);
    }

}
