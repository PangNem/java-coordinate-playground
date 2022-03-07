package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
    private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

    static {
        classifier.put(2, Line::new);
        classifier.put(4, Rectangle::new);
    }

    public static Figure create(List<Point> points) {
        int size = points.size();
        if (size == 3 || size < 2 || size > 4) {
            throw new IllegalArgumentException("허용되지 않은 좌표 허용값입니다.");
        }

        return classifier.get(size)
                .apply(points);
    }
}
