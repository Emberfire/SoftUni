import java.util.ArrayList;
import java.util.HashMap;

public class Garage {
    private HashMap<Integer, Car> parkedCars;

    public Garage() {
        this.setParkedCars(new HashMap<>());
    }

    public void addParkedCar(int id, Car car) {
        this.getParkedCars().put(id, car);
    }

    public void removeParkedCar(Car car) {
        this.getParkedCars().remove(car);
    }

    public final HashMap<Integer, Car> getParkedCars() {
        return this.parkedCars;
    }

    private void setParkedCars(HashMap<Integer, Car> parkedCars) {
        this.parkedCars = parkedCars;
    }
}