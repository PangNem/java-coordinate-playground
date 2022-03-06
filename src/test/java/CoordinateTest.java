import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class CoordinateTest {

    @Nested
    @DisplayName("calculateDistanceWith 메서드는")
    class Describe_calculateDistanceWith {

        @Test
        @DisplayName("계산된 두 거리를 리턴한다")
        void It_returnsCalculatedDistance() {
            Coordinate coordinate = new Coordinate(10, 10);

            double distance = coordinate.calculateDistanceWith(new Coordinate(14, 15));

            assertThat(distance).isEqualTo(6.403124, offset(0.00099));
        }
    }

    @Nested
    @DisplayName("from 메서드는")
    class Describe_from {

        @Test
        @DisplayName("문자열을 파싱하여 만든 좌표를 리턴한다")
        void fromTest2() {
            String inputViewCoordinate = "(10,12)";
            Coordinate coordinate = Coordinate.from(inputViewCoordinate);

            assertThat(coordinate.getX().getX()).isEqualTo(10);
            assertThat(coordinate.getY().getY()).isEqualTo(12);
        }

    }
}
