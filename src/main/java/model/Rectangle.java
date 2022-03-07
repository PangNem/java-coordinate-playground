package model;

import java.util.List;

import static java.lang.Math.floor;

public class Rectangle extends AbstractFigure {
    public static final Integer SIZE = 4;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public String getResult() {
        List<Point> points = getPoints();

        double width = getWidth(points);
        double height = getHeight(points);

        return String.format(
                "직사각형의 넓이는 %s입니다.", toInt(floor(width * height))
        );
    }

    private int toInt(double v) {
        return (int) v;
    }

    private double getHeight(List<Point> points) {
        Point point = points.get(1);
        Point matchYPoint = getMatchYPoint(point);

        return point.calculateWith(matchYPoint);
    }

    private double getWidth(List<Point> points) {
        Point point = points.get(0);
        Point matchXPoint = getMatchXPoint(point);

        return point.calculateWith(matchXPoint);
    }

    private Point getMatchYPoint(Point point) {
        return getPoints().stream()
                .filter(it -> !it.matchX(point))
                .filter(it -> it.matchY(point))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    private Point getMatchXPoint(Point point) {
        return getPoints().stream()
                .filter(it -> !it.matchY(point))
                .filter(it -> it.matchX(point))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
