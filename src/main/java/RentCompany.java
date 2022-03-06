import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();

        cars.forEach(car -> {
            String carName = car.getName();
            int liter = (int) car.getChargeQuantity();

            stringBuilder.append(String.format("%s : %s리터", carName, liter));
            stringBuilder.append(System.getProperty("line.separator"));
        });

        return stringBuilder.toString();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
