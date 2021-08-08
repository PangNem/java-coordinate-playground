package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CoordinatesTest {

    @Test
    void name() {
        Coordinate coordinate1 = new Coordinate(10, 10);
        Coordinate coordinate2 = new Coordinate(14, 15);

        List<Coordinate> coordinateList = Arrays.asList(coordinate1, coordinate2);
        Coordinates actual = new Coordinates(coordinateList);

        assertThat(actual).isEqualTo(new Coordinates(coordinateList));
    }
}
