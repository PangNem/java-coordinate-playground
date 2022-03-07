package model;

import java.util.List;

public class Triangle extends AbstractFigure {
    public static final int SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public String getResult() {
        return null;
    }
}
