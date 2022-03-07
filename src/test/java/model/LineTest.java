package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LineTest {
    private List<Point> points;

    @BeforeEach
    void setUp() {
        this.points = Arrays.asList(
                new Point(10, 10),
                new Point(14, 15)
        );
    }

    @Test
    void 결과값_테스트() {
        Line line = new Line(points);

        String result = line.getResult();

        assertThat(result)
                .isEqualTo("두 점 사이의 거리는 6.4031242374328485 입니다");
    }
}
