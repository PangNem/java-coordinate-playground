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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Y y1 = (Y) o;

        return Double.compare(y1.y, y) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(y);
        return (int) (temp ^ (temp >>> 32));
    }
}
