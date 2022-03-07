package view;

import model.Point;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {
    private static final String INVALID_VALUE_MESSAGE = "잘못된 값입니다.";
    private static final String INPUT_COORDINATE_MESSAGE = "좌표를 입력하세요";
    private static final String COMMA = ",";
    private static final String DASH = "-";
    private static final Scanner scanner = new Scanner(System.in);

    public List<Point> inputCoordinates() {
        System.out.println(INPUT_COORDINATE_MESSAGE);
        String coordinates = scanner.nextLine();

        return inputCoordinates(coordinates);
    }

    public List<Point> inputCoordinates(String coordinates) {
        coordinates = getSpaceReplace(coordinates);

        if (!valid(coordinates)) {
            return inputCoordinates();
        }

        return Stream.of(coordinates.split(DASH))
                .map(this::getPoint)
                .collect(Collectors.toList());
    }

    private String getSpaceReplace(String coordinates) {
        return coordinates.replace(" ", "");
    }

    private boolean valid(String coordinates) {
        String regex = "(\\([0-9]{1,2},[0-9]{1,2}\\))(-\\([0-9]{1,2},[0-9]{1,2}\\))?";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(coordinates);

        if (!matcher.matches()) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return false;
        }

        return true;
    }

    /**
     * 좌표 문자열에서 얻은 포인트를 리턴합니다.
     * @param coordinate 좌표 문자열
     * @return 좌표 문자열에서 얻은 포인트
     */
    private Point getPoint(String coordinate) {
        coordinate = getReplacedParenthesis(coordinate);

        int x = Integer.parseInt(coordinate.split(COMMA)[0]);
        int y = Integer.parseInt(coordinate.split(COMMA)[1]);

        return new Point(x, y);
    }

    /**
     * 괄호가 제거된 문자열 리턴
     * @param s 문자열
     * @return 괄호 제거된 문자열
     */
    private String getReplacedParenthesis(String s) {
        return s.replace("(", "")
                .replace(")", "");
    }

}
