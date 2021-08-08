package domain;

import java.util.Objects;

public abstract class Position {

    public static final int MAX_POSITION = 24;

    protected int position;

    public void checkInvalid(int position) {
        if (position > MAX_POSITION) {
            throw new IllegalArgumentException("최대 값을 초과하였습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
