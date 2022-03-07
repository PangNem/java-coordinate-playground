package model;

import java.util.List;

public class Line implements Figure {
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    public String getResult() {
        double distance = calculateDistance();

        return String.format("두 점 사이의 거리는 %s 입니다", distance);
    }

    private double calculateDistance() {
        Point pointA = points.get(0);
        Point pointB = points.get(1);

        return pointA.calculateWith(pointB);
    }

}
