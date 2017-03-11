package WildFarm.Animal;

import WildFarm.Food.Food;

public class Cat extends Felime {
    private String animalBreed;

    public Cat(String animalType, String animalName, double animalWeight, String animalLivingRegion, String animalBreed) {
        super(animalType, animalName, animalWeight, animalLivingRegion);
        this.setAnimalBreed(animalBreed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    public String getAnimalBreed() {
        return this.animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAnimalType())
                .append(String.format("[%s, %s, %s, %s, %d]",
                        this.getAnimalName(),
                        this.getAnimalBreed(),
                        this.getFormat().format(this.getAnimalWeight()),
                        this.getAnimalRegion(),
                        this.getFoodEaten()));
        return sb.toString();
    }
}