package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class FigureCreatorImpl implements FigureCreator {
    private static final Map<Integer, Function<List<Point>, Figure>> MAP = new HashMap<>();

    static {
        MAP.put(Line.LINE_POINT_SIZE, Line::new);
        MAP.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        MAP.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);
    }

    @Override
    public Figure create(List<Point> points) {
        checkSupportedSize(points);

        return MAP.get(points.size())
                .apply(points);
    }

    private void checkSupportedSize(List<Point> points) {
        Set<Integer> keys = MAP.keySet();
        boolean supportedPointSize = keys.stream()
                .anyMatch(key -> key.equals(points.size()));

        if (!supportedPointSize) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }
    }
}
