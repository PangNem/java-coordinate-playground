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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        X x1 = (X) o;

        return Double.compare(x1.x, x) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(x);
        return (int) (temp ^ (temp >>> 32));
    }
}
