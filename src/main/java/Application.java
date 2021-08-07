import domain.Coordinate;
import java.util.List;
import utils.StringUtils;
import views.InputView;

public class Application {

    public static void main(String[] args) {
        String coordinates = InputView.getCoordinates();

        List<String> coordinateList = StringUtils.parse(coordinates);

        coordinateList.forEach(coordinate -> {
            List<Integer> coodinateNumber = StringUtils.splitAndToInt(coordinate);

            int x = coodinateNumber.get(0);
            int y = coodinateNumber.get(1);

            System.out.printf("x: %s, y: %s \n", x, y);
            new Coordinate(x, y);
        });
    }
}
