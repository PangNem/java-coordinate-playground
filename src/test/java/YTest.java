import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class YTest {

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
}
