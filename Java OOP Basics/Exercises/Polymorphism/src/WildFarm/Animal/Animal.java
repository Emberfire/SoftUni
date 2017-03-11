package WildFarm.Animal;

import WildFarm.Food.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animaltype;
    private double animalWeight;
    private int foodEaten;
    private DecimalFormat format;

    Animal(String animalType, String animalName, double animalWeight) {
        this.setAnimaltype(animalType);
        this.setAnimalName(animalName);
        this.setAnimalWeight(animalWeight);
        this.setFormat();
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return this.animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public double getAnimalWeight() {
        return this.animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public int getFoodEaten() {
        return this.foodEaten;
    }

    public DecimalFormat getFormat() {
        return this.format;
    }

    public void setFormat() {
        this.format = new DecimalFormat();
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}