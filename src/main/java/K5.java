public class K5 implements Car {
    private final int fuel;

    public K5(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getLiter() {
        return this.fuel / 13;
    }
}
