import domain.Coordinate;
import java.util.ArrayList;
import java.util.List;
import utils.StringUtils;
import views.InputView;

public class Application {

    public static void main(String[] args) {
        List<Coordinate> coordinates = getUserInputCoordinates();
    }

    private static List<Coordinate> getUserInputCoordinates() {
        String userInputCoordinate = InputView.getCoordinates();
        List<String> coordinateList = StringUtils.parse(userInputCoordinate);

        List<Coordinate> coordinates = new ArrayList<>();
        try {
            coordinates = createCoordinates(coordinateList);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getUserInputCoordinates();
        }

        return coordinates;
    }

    private static List<Coordinate> createCoordinates(List<String> coordinateList) {
        List<Coordinate> coordinates = new ArrayList<>();
        coordinateList.forEach(coordinate -> {
            List<Integer> coodinateNumber = StringUtils.splitAndToInt(coordinate);

            int x = coodinateNumber.get(0);
            int y = coodinateNumber.get(1);

            coordinates.add(new Coordinate(x, y));
        });

        return coordinates;
    }


}
