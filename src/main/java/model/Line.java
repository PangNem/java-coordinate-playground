package model;

import java.util.List;

public class Line extends AbstractFigure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String getResult() {
        double distance = calculateDistance();

        return String.format("두 점 사이의 거리는 %s 입니다", distance);
    }

    private double calculateDistance() {
        Point pointA = getPoints().get(0);
        Point pointB = getPoints().get(1);

        return pointA.calculateWith(pointB);
    }

}
