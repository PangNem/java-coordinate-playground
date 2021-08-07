package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    @DisplayName("좌표 객체 생성 테스트")
    void create() {
        Coordinate coordinate = new Coordinate(10, 10);

        assertThat(coordinate.isMatchX(new PositionX(10))).isTrue();
        assertThat(coordinate.isMatchY(new PositionY(10))).isTrue();

        coordinate = new Coordinate(10);

        assertThat(coordinate.isMatchX(new PositionX(10))).isTrue();
        assertThat(coordinate.isMatchY(new PositionY())).isTrue();
    }
}
