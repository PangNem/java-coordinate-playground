package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        this.triangle = new Triangle(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        ));
    }

    @Test
    void 결과값_테스트() {
        String result = triangle.getResult();

        assertThat(result)
                .isEqualTo("삼각형의 넓이는 29.0입니다.");
    }
}
