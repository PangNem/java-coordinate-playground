package view;

import model.Figure;
import model.Line;
import model.Point;
import model.Rectangle;

import java.util.List;

public class OutputView {
    public void output(List<Point> points) {
        Figure figure = null;

        if (points.size() == 2) {
            figure = new Line(points);
        } else if (points.size() == 4) {
            figure = new Rectangle(points);
        } else {
            throw new IllegalArgumentException("허용되지 않은 좌표 허용값입니다.");
        }

        String result = figure.getResult();
        System.out.println(result);
    }
}
