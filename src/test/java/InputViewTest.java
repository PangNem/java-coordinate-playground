import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class InputViewTest {
    private InputView inputView;

    @BeforeEach
    void setUp() {
        this.inputView = new InputView();
    }

    @Nested
    @DisplayName("input 메서드는")
    class Describe_input {

        @Nested
        @DisplayName("좌표 2개가 주어진 경우")
        class Context_twoCoordinates {

            @Test
            @DisplayName("두 점 사이의 거리를 리턴한다")
            void It_returnsDistanceBetweenTwoPoint() {
                String coordinate = "(10,10)-(14,15)";

                double distance = inputView.input(coordinate);

                assertThat(distance).isEqualTo(6.403124, offset(0.00099));
            }

        }

        @Nested
        @DisplayName("좌표 4개가 주어진 경우")
        class Context_fourCoordinates {

            @ParameterizedTest
            @CsvSource(
                    value = {
                            "(10,10)-(22,10)-(22,18)-(10,18):96",
                            "(10,10)-(22,10)-(22,19)-(10,19):108"
                    },
                    delimiterString = ":"
            )
            @DisplayName("사각형의 넓이를 리턴한다")
            void It_returnsSquareWidth(String coordinate, int expect) {
                double extent = inputView.input(coordinate);

                assertThat(extent).isEqualTo(expect, offset(0.00099));
            }
        }
    }
}
