public class Sonata extends Car {
    private final long tripDistance;

    public Sonata(long tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    double getDistancePerLiter() {
        return this.tripDistance / 10;
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
