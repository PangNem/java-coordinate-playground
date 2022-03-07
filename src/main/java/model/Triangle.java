package model;

import java.util.List;

public class Triangle extends AbstractFigure {
    public static final int SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public String getResult() {
        Point pointA = getPoints().get(0);
        Point pointB = getPoints().get(1);
        Point pointC = getPoints().get(2);

        double a = pointB.calculateWith(pointC);
        double b = pointA.calculateWith(pointC);
        double c = pointA.calculateWith(pointB);

        double extent = getExtentWithHeron(a, b, c);

        return String.format("삼각형의 넓이는 %.1f입니다.", extent);
    }

    /**
     * 헤론의 법칙을 이용해 얻은 삼각형 넓이를 리턴한다.
     *
     * @return 헤론의 법칙을 이용해 얻은 삼각형 넓이
     */
    private double getExtentWithHeron(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double extent = Math.sqrt(
                s * (s - a) * (s - b) * (s - c)
        );
        return extent;
    }
}
