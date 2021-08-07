package views;

import java.util.Scanner;

public class InputView {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String getCoordinates() {
        System.out.println("좌표를 입력하세요.");
        return SCANNER.nextLine();
    }

}
