import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        String coordinate = new Scanner(System.in).nextLine();
        double distance = inputView.input(coordinate);

        OutPutView outPutView = new OutPutView();
        String output = outPutView.output(distance);

        System.out.println(output);
    }
}
