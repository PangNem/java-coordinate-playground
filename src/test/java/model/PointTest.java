package model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PointTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 25})
    void 최소값_및_최대값_테스트(int value) {
        assertThatThrownBy(() -> new Point(value, value))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void X값_일치_테스트() {
        Point point = new Point(10, 12);

        boolean actual = point.matchX(new Point(10, 14));

        assertThat(actual).isTrue();
    }

    @Test
    void Y값_일치_테스트() {
        Point point = new Point(10, 14);

        boolean actual = point.matchY(new Point(12, 14));

        assertThat(actual).isTrue();
    }
}
