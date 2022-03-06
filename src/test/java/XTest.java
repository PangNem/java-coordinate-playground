import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class XTest {

    @Nested
    @DisplayName("생성자는")
    class Describe_constructor {

        @Nested
        @DisplayName("24가 넘거나 -24보다 작은값이 주어질 경우")
        class Context_greaterThen24OrLessThenMinus24 {

            @ParameterizedTest
            @ValueSource(ints = {25, -25})
            @DisplayName("IllegalArgumentException을 던진다")
            void It_throwsIllegalArgumentException(int inValidValue) {
                assertThatThrownBy(() -> new X(inValidValue))
                        .isInstanceOf(IllegalArgumentException.class);
            }
        }
    }

    @Nested
    @DisplayName("equals 메서드는")
    class Context_equals {

        @ParameterizedTest
        @ValueSource(ints = {1, 3, 5})
        @DisplayName("값이 값을 경우 true를 리턴한다")
        void It_returnsIfSameValue(int value) {
            X x = new X(value);

            assertThat(x).isEqualTo(new X(value));
        }
    }
}
