import java.util.List;
import utils.StringUtils;
import views.InputView;

public class Application {

    public static void main(String[] args) {
        String coordinates = InputView.getCoordinates();

        List<String> coordinateList = StringUtils.parse(coordinates);

        coordinateList.forEach(coordinate -> {
            System.out.println(StringUtils.splitAndToInt(coordinate));
        });
    }
}
