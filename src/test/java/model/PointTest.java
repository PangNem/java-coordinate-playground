package model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PointTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 25})
    void 최소값_및_최대값_테스트(int value) {
        assertThatThrownBy(() -> new Point(value, value))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
