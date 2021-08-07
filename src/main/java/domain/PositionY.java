package domain;

public class PositionY extends Position {

    public PositionY() {
        this(0);
    }

    public PositionY(int position) {
        checkInvalid(position);
        this.position = position;
    }
}
