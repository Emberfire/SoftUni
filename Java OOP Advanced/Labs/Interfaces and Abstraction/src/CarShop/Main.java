package CarShop;

public class Main {
    public static void main(String[] args) {
        Car car = new Seat("Leon", "Gray", 110, "Spain");

        System.out.println(String.format("%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));

        System.out.println(car.toString());
    }
}