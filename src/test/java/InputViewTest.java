import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class InputViewTest {
    private InputView inputView;

    @BeforeEach
    void setUp() {
        this.inputView = new InputView();
    }

    @Nested
    @DisplayName("input 메서드는")
    class Describe_input {

        @Test
        @DisplayName("좌표를 리턴한다.")
        void It_returnsCoordinate() {
            String coordinate = "(10,10)-(14,15)";

            double distance = inputView.input(coordinate);

            assertThat(distance).isEqualTo(6.403124, offset(0.00099));
        }
    }
}
