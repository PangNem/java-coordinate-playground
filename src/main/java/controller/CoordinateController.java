package controller;

import model.Point;
import view.InputView;
import view.OutputView;

import java.util.List;

public class CoordinateController {
    public void run() {
        List<Point> points = new InputView().inputCoordinates();

        new OutputView().output(points);
    }
}
