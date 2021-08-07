package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionYTest {

    @Test
    @DisplayName("포지션Y 테스트")
    void positionY() {
        assertThat(new PositionY().isMatch(0)).isTrue();
        assertThat(new PositionY(10).isMatch(10)).isTrue();
    }
}
