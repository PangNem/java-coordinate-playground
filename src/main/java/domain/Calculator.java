package domain;

import java.util.Arrays;
import java.util.List;

public class Calculator {


    public static double calculate(Coordinates coordinates) {
        List<Coordinate> coordinateList = coordinates.getCoordinates();

        if (coordinateList.size() == 2) {
            return getTwoCoordinateDistance(coordinateList);
        }

        return getFourCoordinateDistance(coordinateList);
    }

    private static double getFourCoordinateDistance(List<Coordinate> coordinateList) {
        List<Coordinate> coordinateListGroup1 = Arrays
            .asList(coordinateList.get(0), coordinateList.get(1));
        List<Coordinate> coordinateListGroup2 = Arrays
            .asList(coordinateList.get(1), coordinateList.get(2));

        return getTwoCoordinateDistance(coordinateListGroup1) * getTwoCoordinateDistance(
            coordinateListGroup2);
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
