package model;

import java.util.List;

public class FigureFactory {
    public static Figure create(List<Point> points) {
        if (points.size() == 2) {
            return new Line(points);
        }

        if (points.size() == 4) {
            return new Rectangle(points);
        }

        throw new IllegalArgumentException("허용되지 않은 좌표 허용값입니다.");
    }
}
