package view;

import model.Figure;
import model.FigureFactory;
import model.Line;
import model.Point;
import model.Rectangle;

import java.util.List;

public class OutputView {
    public void output(List<Point> points) {
        Figure figure = FigureFactory.create(points);

        String result = figure.getResult();
        System.out.println(result);
    }
}
