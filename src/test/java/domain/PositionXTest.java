package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositionXTest {

    @ParameterizedTest
    @DisplayName("음수 혹은 값 초과시 에러 발생")
    @ValueSource(ints = {-1, 25})
    void invalid(int value) {
        assertThatThrownBy(() -> {
            new PositionX(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("포지션X 테스트")
    void positionX() {
        assertThat(new PositionX(0).isMatch(0)).isTrue();
        assertThat(new PositionX(10).isMatch(10)).isTrue();
    }
}
