package WildFarm.Animal;

import WildFarm.Food.Food;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, double animalWeight, String animalLivingRegion) {
        super(animalType, animalName, animalWeight, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }

        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAnimalType())
                .append(String.format("[%s, %s, %s, %d]",
                        this.getAnimalName(),
                        this.getFormat().format(this.getAnimalWeight()),
                        this.getAnimalRegion(),
                        this.getFoodEaten()));
        return sb.toString();
    }
}