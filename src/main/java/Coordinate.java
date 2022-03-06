public class Coordinate {
    public static final int MAX_VALUE = 24;
    public static final int MIN_VALUE = -24;

    private final double x;
    private final double y;

    public Coordinate(double x, double y) {
        validate(x, y);

        this.x = x;
        this.y = y;
    }

    private void validate(double x, double y) {
        if (x > MAX_VALUE || y > MAX_VALUE) {
            throw new IllegalArgumentException();
        }

        if (x < MIN_VALUE || y < MIN_VALUE) {
            throw new IllegalArgumentException();
        }
    }

    public static Coordinate from(String inputViewCoordinate) {
        String[] split = inputViewCoordinate.split(",");

        double x = Double.parseDouble(split[0].replace("(", ""));
        double y = Double.parseDouble(split[1].replace(")", ""));

        return new Coordinate(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistanceWith(Coordinate coordinate) {
        return Math.sqrt(
                Math.pow((this.getX() - coordinate.getX()), 2)
                        + Math.pow((this.getY() - coordinate.getY()), 2)
        );
    }
}
