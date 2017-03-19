import java.util.ArrayList;

public class DriftRace extends Race {
    private ArrayList<Car> winners;

    public DriftRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    @Override
    public void calculatePoints() {
        for (Car car : this.getParticipants()) {
            car.setPerformancePoints(car.getSuspension() + car.getDurability());
        }
    }

    public final ArrayList<Car> getWinners() {
        return this.winners;
    }

    private void setWinners(ArrayList<Car> winners) {
        this.winners = winners;
    }

    @Override
    public String toString() {
        StringBuilder winners = new StringBuilder();
        if (this.getParticipants().size() == 1) {
            winners.append(String.format("1. %s %s %dPP - $%d%n",
                    this.getFirstPlace().getBrand(),
                    this.getFirstPlace().getModel(),
                    this.getFirstPlace().getPerformancePoints(),
                    (this.getPrizePool() * 50) / 100));
        } else if (this.getParticipants().size() == 2) {
            winners.append(String.format("1. %s %s %dPP - $%d%n",
                    this.getFirstPlace().getBrand(),
                    this.getFirstPlace().getModel(),
                    this.getFirstPlace().getPerformancePoints(),
                    (this.getPrizePool() * 50) / 100))
                    .append(String.format("2. %s %s %dPP - $%d",
                            this.getSecondPlace().getBrand(),
                            this.getSecondPlace().getModel(),
                            this.getSecondPlace().getPerformancePoints(),
                            (this.getPrizePool() * 30) / 100));
        } else {
            winners.append(String.format("1. %s %s %dPP - $%d%n",
                    this.getFirstPlace().getBrand(),
                    this.getFirstPlace().getModel(),
                    this.getFirstPlace().getPerformancePoints(),
                    (this.getPrizePool() * 50) / 100))
                    .append(String.format("2. %s %s %dPP - $%d%n",
                            this.getSecondPlace().getBrand(),
                            this.getSecondPlace().getModel(),
                            this.getSecondPlace().getPerformancePoints(),
                            (this.getPrizePool() * 30) / 100))
                    .append(String.format("3. %s %s %dPP - $%d",
                            this.getThirdPlace().getBrand(),
                            this.getThirdPlace().getModel(),
                            this.getThirdPlace().getPerformancePoints(),
                            (this.getPrizePool() * 20) / 100));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %d%n", this.getRoute(), this.getLength()))
                .append(winners);
        return sb.toString();
    }
}