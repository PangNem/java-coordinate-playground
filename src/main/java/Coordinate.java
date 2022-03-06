public class Coordinate {
    private final X x;
    private final Y y;

    public Coordinate(double x, double y) {
        this.x = new X(x);
        this.y = new Y(y);
    }

    public static Coordinate from(String inputViewCoordinate) {
        String[] split = inputViewCoordinate.split(",");

        double x = Double.parseDouble(split[0].replace("(", ""));
        double y = Double.parseDouble(split[1].replace(")", ""));

        return new Coordinate(x, y);
    }

    public double getX() {
        return this.x.getX();
    }

    public double getY() {
        return this.y.getY();
    }

    public double calculateDistanceWith(Coordinate coordinate) {
        return Math.sqrt(
                Math.pow((this.getX() - coordinate.getX()), 2)
                        + Math.pow((this.getY() - coordinate.getY()), 2)
        );
    }
}
