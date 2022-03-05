public class Avante implements Car {
    private final int fuel;

    public Avante(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getLiter() {
        return this.fuel / 15;
    }
}
