package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PositionYTest {

    @ParameterizedTest
    @DisplayName("음수 혹은 값 초과시 에러 발생")
    @ValueSource(ints = {-1, 25})
    void invalid(int value) {
        assertThatThrownBy(() -> {
            new PositionY(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("포지션Y 테스트")
    void positionY() {
        assertThat(new PositionY()).isEqualTo(new PositionY());
        assertThat(new PositionY(10)).isEqualTo(new PositionY(10));
    }
}
