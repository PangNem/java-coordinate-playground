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

        return getDistanceFromTwoCoordinate(coordinate1, coordinate2);
    }

    private static double getDistanceFromTwoCoordinate(Coordinate coordinate1,
        Coordinate coordinate2) {
        return Math.sqrt(
            Math.pow(coordinate1.getPositionX().position - coordinate2.getPositionX().position, 2)
                + Math
                .pow(
                    coordinate1.getPositionY().position - coordinate2.getPositionY().position, 2));
    }
}
