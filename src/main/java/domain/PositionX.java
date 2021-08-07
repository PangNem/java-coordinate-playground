package domain;

public class PositionX extends Position {

    public PositionX(int position) {
        checkInvalid(position);
        this.position = position;
    }
}
