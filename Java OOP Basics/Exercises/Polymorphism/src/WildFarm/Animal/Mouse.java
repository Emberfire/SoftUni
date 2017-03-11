package WildFarm.Animal;

import WildFarm.Food.Food;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, double animalWeight, String animalLivingRegion) {
        super(animalType, animalName, animalWeight, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
        System.out.println("A cheese was just eaten!");
    }

    @Override
    public void eat(Food food) {
        if (!food.getClass().getSimpleName().equals("Vegetable")) {
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
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