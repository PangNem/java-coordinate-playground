package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("두 점 사이의 거리를 계산한다")
    void calculate() {
        Coordinates coordinates = new Coordinates(
            Arrays.asList(new Coordinate(10, 10), new Coordinate(14, 15)));

        double actual = Calculator.calculate(coordinates);

        assertThat(actual).isEqualTo(6.403124, offset(0.000999));
    }
}