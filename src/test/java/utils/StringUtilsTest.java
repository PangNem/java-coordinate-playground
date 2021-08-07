package utils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    @DisplayName("쉼표 기준으로 구분하여 숫자로 반환한다")
    void split() {
        String parsedUserInput = "10,10";
        List<Integer> actual = StringUtils.splitAndToInt(parsedUserInput);

        assertThat(actual).isEqualTo(Arrays.asList(10, 10));

        parsedUserInput = "10";
        actual = StringUtils.splitAndToInt(parsedUserInput);

        assertThat(actual).isEqualTo(Arrays.asList(10));
    }

    @Test
    @DisplayName("입력받은 문자열을 파싱한다")
    void parse() {
        String userInputString = "(10)-(14)";
        List<String> actual = StringUtils.parse(userInputString);

        assertThat(actual).isEqualTo(Arrays.asList("10", "14"));

        userInputString = "(10,10)-(14,15)";
        actual = StringUtils.parse(userInputString);

        assertThat(actual).isEqualTo(Arrays.asList("10,10", "14,15"));
    }
}
