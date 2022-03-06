import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OutPutViewTest {
    private OutPutView outPutView;

    @BeforeEach
    void setUp() {
        this.outPutView = new OutPutView();
    }

    @Test
    void output() {
        double distance = 6.403124;

        String result = outPutView.output(distance);

        assertThat(result).isEqualTo("두 점 사이 거리는 6.403124");
    }
}
