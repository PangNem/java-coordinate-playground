public class K5 extends Car {
    private final int tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    double getDistancePerLiter() {
        return this.tripDistance / 13;
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
