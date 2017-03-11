package WildFarm.Animal;

public abstract class Mammal extends Animal {
    private String animalLivingRegion;

    Mammal(String animalType, String animalName, double animalWeight, String animalLivingRegion) {
        super(animalType, animalName, animalWeight);
        this.setAnimalLivingRegion(animalLivingRegion);
    }

    public String getAnimalRegion() {
        return this.animalLivingRegion;
    }

    public void setAnimalLivingRegion(String animalRegion) {
        this.animalLivingRegion = animalRegion;
    }
}