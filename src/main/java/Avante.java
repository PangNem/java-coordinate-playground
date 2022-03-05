public class Avante extends Car {
    private final int tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    double getDistancePerLiter() {
        return this.tripDistance / 15;
    }

    /**
     * 여행하려는 거리
     */
    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    /**
     * 차종의 이름
     */
    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }
}
