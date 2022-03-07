package view;

import model.Line;
import model.Point;

import java.util.List;

public class OutputView {
    public void output(List<Point> points) {
        Line line = new Line(points);

        String result = line.getResult();
        System.out.println(result);
    }
}
