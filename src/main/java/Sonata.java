public class Sonata implements Car {
    private final int fuel;

    public Sonata(int fuel) {
        this.fuel = fuel;
    }

    public int getLiter() {
        return fuel / 10;
    }
}
