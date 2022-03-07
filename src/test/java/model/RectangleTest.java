package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        this.rectangle = new Rectangle(Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        ));
    }

    @Test
    void 결과값_테스트() {
        String result = rectangle.getResult();

        assertThat(result)
                .isEqualTo("직사각형의 넓이는 96입니다.");
    }
}
