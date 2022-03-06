import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public double input(String coordinate) {
        String[] split = coordinate.split("-");

        List<Coordinate> coordinates = Arrays.stream(split)
                .map(Coordinate::from)
                .collect(Collectors.toList());

        if (coordinates.size() == 2) {
            Coordinate coordinate1 = coordinates.get(0);
            Coordinate coordinate2 = coordinates.get(1);

            return coordinate1.calculateDistanceWith(coordinate2);
        }

        if (coordinates.size() == 4) {
            Coordinate coordinate1 = coordinates.get(0);

            Coordinate coordinate2 = coordinates.stream()
                    .filter(it -> !it.matchY(coordinate1))
                    .filter(it -> it.matchX(coordinate1))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("직사각형만 허용됩니다."));

            double height = coordinate1.getHeightWith(coordinate2);

            Coordinate coordinate3 = coordinates.stream()
                    .filter(it -> !it.matchX(coordinate1))
                    .filter(it -> it.matchY(coordinate1))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("직사각형만 허용됩니다."));

            double width = coordinate1.getWidthWith(coordinate3);

            return width * height;
        }

        return 0;
    }

}
