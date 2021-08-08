package domain;

import java.util.List;

public class Calculator {


    public static double calculate(Coordinates coordinates) {
        List<Coordinate> coordinateList = coordinates.getCoordinates();

        return getTwoCoordinateDistance(coordinateList);
    }

    private static double getTwoCoordinateDistance(List<Coordinate> coordinateList) {
        Coordinate coordinate1 = coordinateList.get(0);
        Coordinate coordinate2 = coordinateList.get(1);

        PositionX coordinate1PositionX = coordinate1.getPositionX();
        PositionY coordinate1PositionY = coordinate1.getPositionY();

        PositionX coordinate2PositionX = coordinate2.getPositionX();
        PositionY coordinate2PositionY = coordinate2.getPositionY();

        return Math.sqrt(
            Math.pow(coordinate1PositionX.position - coordinate2PositionX.position, 2) + Math
                .pow(
                    coordinate1PositionY.position - coordinate2PositionY.position, 2));
    }
}
