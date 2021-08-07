package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<String> parse(String userInputString) {
        return Arrays.stream(userInputString.split("-"))
            .map(string -> string.replace("(", ""))
            .map(string -> string.replace(")", ""))
            .collect(Collectors.toList());
    }
}
