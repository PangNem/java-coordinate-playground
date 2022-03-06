public class Avante implements Car {
    private final int tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    /**
     * 여행하려는 거리
     */
    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    /**
     * 차종의 이름
     */
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
