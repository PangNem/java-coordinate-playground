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

    public static List<Integer> splitAndToInt(String parsedUserInput) {
        List<Integer> splitedList = Arrays.stream(parsedUserInput.split(","))
            .map(StringUtils::toInt)
            .collect(Collectors.toList());

        if (splitedList.size() == 1) {
            splitedList.add(0);
        }

        return splitedList;
    }

    private static int toInt(String string) {
        return Integer.parseInt(string);
    }
}
