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

        return 0;
    }

}
