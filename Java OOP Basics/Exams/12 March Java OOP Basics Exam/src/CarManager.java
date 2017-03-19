import java.util.HashMap;

public class CarManager {
    private HashMap<Integer, Car> cars;
    private HashMap<Integer, Race> races;
    private Garage garage;

    public CarManager() {
        this.setCars(new HashMap<>());
        this.setRaces(new HashMap<>());
        this.setGarage(new Garage());
    }

    public void register(int id, String type, String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        if (type.equals("Performance")) {
            this.getCars().put(id, new PerformanceCar(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability));
        } else if (type.equals("Show")) {
            this.getCars().put(id, new ShowCar(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability));
        }
    }

    public String check(int id) {
        return this.getCars().get(id).toString();                            //May not find one!!!
    }

    public void open(int id, String type, int length, String route, int prizePool) {
        switch (type) {
            case "Casual":
                this.getRaces().put(id, new CasualRace(length, route, prizePool));
                break;
            case "Drag":
                this.getRaces().put(id, new DragRace(length, route, prizePool));
                break;
            case "Drift":
                this.getRaces().put(id, new DriftRace(length, route, prizePool));
                break;

        }
    }

    public void participate(int carId, int raceId) {
        if (!this.getGarage().getParkedCars().containsKey(this.getCars().get(carId))) {
            Car carToParticipate = this.getCars().get(carId);
            this.getRaces().get(raceId).addParticipant(carToParticipate);
        }
    }

    public String start(int raceId) {
        if (!this.getRaces().get(raceId).getParticipants().isEmpty()) {
            Race startingRace = this.getRaces().get(raceId);
            startingRace.calculatePoints();
            startingRace.calculateWinners();

            return startingRace.toString();
        }

        return "Cannot start the race with zero participants.";
    }

    public void park(int id) {
        if (!this.getRaces().containsKey(id)) {
            Car carToPark = this.getCars().get(id);
            this.getGarage().addParkedCar(id, carToPark);
        }
    }

    public void unpark(int id) {
            Car carToRemove = this.getGarage().getParkedCars().get(id);
        this.getGarage().removeParkedCar(carToRemove);
    }

    public void tune(int tuneIndex, String addOn) {
        if (!this.getGarage().getParkedCars().isEmpty()) {
            this.getGarage().getParkedCars().entrySet().forEach(car -> {
                car.getValue().tuneCar(tuneIndex);
                if (car instanceof PerformanceCar) {
                    ((PerformanceCar) car).getAddOns().add(addOn);
                } else if (car instanceof ShowCar) {
                    ((ShowCar) car).addStars(tuneIndex);
                }
            });
        }
    }

    public final HashMap<Integer, Car> getCars() {
        return this.cars;
    }

    private void setCars(HashMap<Integer, Car> cars) {
        this.cars = cars;
    }

    public final HashMap<Integer, Race> getRaces() {
        return this.races;
    }

    private void setRaces(HashMap<Integer, Race> races) {
        this.races = races;
    }

    public final Garage getGarage() {
        return this.garage;
    }

    private void setGarage(Garage garage) {
        this.garage = garage;
    }
}