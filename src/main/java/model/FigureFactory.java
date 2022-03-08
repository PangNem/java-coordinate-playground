package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
    private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

    static {
        classifier.put(Line.SIZE, Line::new);
        classifier.put(Rectangle.SIZE, Rectangle::new);
        classifier.put(Triangle.SIZE, Triangle::new);
    }

    public static Figure create(List<Point> points) {
        int size = points.size();
        if (!allowedCount(size)) {
            throw new IllegalArgumentException("허용되지 않은 좌표 개수입니다.");
        }

        return classifier.get(size)
                .apply(points);
    }

    private static boolean allowedCount(int size) {
        return size >= Line.SIZE && size <= Rectangle.SIZE;
    }
}
