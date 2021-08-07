package domain;

public abstract class Position {

    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 24;

    protected int position;

    public void checkInvalid(int position) {
        if (position < MIN_POSITION || position > MAX_POSITION) {
            throw new IllegalArgumentException("음수 값이거나 값을 초과하였습니다.");
        }
    }

    public boolean isMatch(int position) {
        return this.position == position;
    }
}
