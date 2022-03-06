public class Y {
    private static final int MAX_VALUE = 24;
    private static final int MIN_VALUE = -24;

    private final double y;

    public Y(double y) {
        if (y > MAX_VALUE || y < MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        this.y = y;
    }

    public double getY() {
        return y;
    }
}
