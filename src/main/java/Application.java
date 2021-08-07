import utils.StringUtils;
import views.InputView;

public class Application {

    public static void main(String[] args) {
        String coordinates = InputView.getCoordinates();

        StringUtils.parse(coordinates)
            .forEach(System.out::println);
    }

}
