public class X {
    private static final int MAX_VALUE = 24;
    private static final int MIN_VALUE = -24;

    private final double x;

    public X(double x) {
        if (x > MAX_VALUE || x < MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        this.x = x;
    }

    public double getX() {
        return x;
    }
}
