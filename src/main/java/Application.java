import domain.Coordinate;
import domain.Coordinates;
import java.util.ArrayList;
import java.util.List;
import utils.StringUtils;
import views.InputView;

public class Application {

    public static void main(String[] args) {
        Coordinates coordinates = getUserInputCoordinates();
    }

    private static Coordinates getUserInputCoordinates() {
        String userInputCoordinate = InputView.getCoordinates();
        List<String> parsedCoordinates = StringUtils.parse(userInputCoordinate);

        Coordinates coordinates = null;
        try {
            coordinates = createCoordinates(parsedCoordinates);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getUserInputCoordinates();
        }

        return coordinates;
    }

    private static Coordinates createCoordinates(List<String> parsedCoordinates) {
        List<Coordinate> coordinateList = new ArrayList<>();
        parsedCoordinates.forEach(coordinate -> {
            List<Integer> coodinateNumber = StringUtils.splitAndToInt(coordinate);

            int x = coodinateNumber.get(0);
            int y = coodinateNumber.get(1);

            coordinateList.add(new Coordinate(x, y));
        });

        return new Coordinates(coordinateList);
    }


}
