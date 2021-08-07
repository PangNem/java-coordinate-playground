package utils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void parse() {
        String userInputString = "(10)-(14)";
        List<String> actual = StringUtils.parse(userInputString);

        assertThat(actual).isEqualTo(Arrays.asList("10", "14"));

        userInputString = "(10,10)-(14,15)";
        actual = StringUtils.parse(userInputString);

        assertThat(actual).isEqualTo(Arrays.asList("10,10", "14,15"));
    }
}
