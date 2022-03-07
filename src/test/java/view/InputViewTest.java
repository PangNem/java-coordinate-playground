package view;

import model.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {
    private InputView inputView;

    @BeforeEach
    void setUp() {
        this.inputView = new InputView();
    }

    @Test
    void 두점_입력_테스트() {
        List<Point> points = inputView.inputCoordinates("(10, 10)-(14, 15)");

        assertThat(points).isEqualTo(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15)
        ));
    }

    @Test
    void 네점_입력_테스트() {
        List<Point> points = inputView.inputCoordinates("(10,10)-(22,10)-(22,18)-(10,18)");

        assertThat(points).isEqualTo(Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        ));
    }
}
