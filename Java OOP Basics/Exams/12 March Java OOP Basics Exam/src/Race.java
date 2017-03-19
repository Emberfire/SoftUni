import java.util.ArrayList;
import java.util.Comparator;

public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    private ArrayList<Car> participants;
    private Car firstPlace;
    private Car secondPlace;
    private Car ThirdPlace;


    protected Race(int length, String route, int prizePool) {
        this.setLength(length);
        this.setRoute(route);
        this.setPrizePool(prizePool);
        this.setParticipants(new ArrayList<>());
    }

    @Override
    public abstract String toString();

    public abstract void calculatePoints();

    public void calculateWinners() {
        this.getParticipants().sort(Comparator.comparingInt(Car::getPerformancePoints).reversed());
        if (this.getParticipants().size() == 1) {
            this.setFirstPlace(this.getParticipants().get(0));
        } else if (this.getParticipants().size() == 2) {
            this.setFirstPlace(this.getParticipants().get(0));
            this.setSecondPlace(this.getParticipants().get(1));
        } else {
            this.setFirstPlace(this.getParticipants().get(0));
            this.setSecondPlace(this.getParticipants().get(1));
            this.setThirdPlace(this.getParticipants().get(2));
        }
    }

    public final Car getFirstPlace() {
        return this.firstPlace;
    }

    private void setFirstPlace(Car firstPlace) {
        this.firstPlace = firstPlace;
    }

    public final Car getSecondPlace() {
        return this.secondPlace;
    }

    private void setSecondPlace(Car secondPlace) {
        this.secondPlace = secondPlace;
    }

    public final Car getThirdPlace() {
        return this.ThirdPlace;
    }

    public void setThirdPlace(Car thirdPlace) {
        ThirdPlace = thirdPlace;
    }

    public void addParticipant(Car car) {
        this.getParticipants().add(car);
    }

    public final int getLength() {
        return this.length;
    }

    private void setLength(int length) {
        this.length = length;
    }

    public final String getRoute() {
        return this.route;
    }

    private void setRoute(String route) {
        this.route = route;
    }

    public final int getPrizePool() {
        return this.prizePool;
    }

    private void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public final ArrayList<Car> getParticipants() {
        return this.participants;
    }

    private void setParticipants(ArrayList<Car> participants) {
        this.participants = participants;
    }
}