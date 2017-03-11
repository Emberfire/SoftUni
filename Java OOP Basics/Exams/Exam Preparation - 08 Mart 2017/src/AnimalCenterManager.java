import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class AnimalCenterManager {
    private HashMap<String, AdoptionCenter> adoptionCenters;
    private HashMap<String, CleansingCenter> cleansingCenters;

    private ArrayList<String> adoptedAnimals;
    private ArrayList<String> cleansedAnimals;


    public AnimalCenterManager() {
        this.adoptedAnimals = new ArrayList<>();
        this.cleansedAnimals = new ArrayList<>();
        this.setAdoptionCenters(new HashMap<>());
        this.setCleansingCenters(new HashMap<>());
    }

    private void addCleansingCenter(CleansingCenter cleansingCenter) {
        this.cleansingCenters.put(cleansingCenter.getName(), cleansingCenter);
    }

    private HashMap<String, CleansingCenter> getCleansingCenters() {
        return this.cleansingCenters;
    }

    private void setCleansingCenters(HashMap<String, CleansingCenter> cleansingCenters) {
        this.cleansingCenters = cleansingCenters;
    }

    private HashMap<String, AdoptionCenter> getAdoptionCenters() {
        return this.adoptionCenters;
    }

    private void setAdoptionCenters(HashMap<String, AdoptionCenter> adoptionCenters) {
        this.adoptionCenters = adoptionCenters;
    }

    private void addAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenters.put(adoptionCenter.getName(), adoptionCenter);
    }

    public void registerCleansingCenter(String name) {
        this.addCleansingCenter(new CleansingCenter(name));
    }

    public void registerAdoptionCenter(String name) {
        this.addAdoptionCenter(new AdoptionCenter(name));
    }

    public void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog dog = new Dog(name, age, learnedCommands);
        this.adoptionCenters.get(adoptionCenterName).getStoredAnimals().add(dog);
    }

    public void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat cat = new Cat(name, age, intelligenceCoefficient);
        this.adoptionCenters.get(adoptionCenterName).getStoredAnimals().add(cat);
    }

    public void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        ArrayList<Animal> animalsToSend = this.adoptionCenters.get(adoptionCenterName).getStoredAnimals().stream()
                .filter(animal -> !animal.getCleansedStatus())
                .collect(Collectors.toCollection(ArrayList::new));
        for (Animal animal : animalsToSend) {
            this.cleansingCenters.get(cleansingCenterName).getStoredAnimals().add(animal);
        }
    }

    public void cleanse(String cleansingCenterName) {
        ArrayList<Animal> cleansedAnimals = new ArrayList<>(this.getCleansingCenters().get(cleansingCenterName).getStoredAnimals());
        this.getCleansingCenters().get(cleansingCenterName).setStoredAnimals(new ArrayList<>());

        for (Animal cleansedAnimal : cleansedAnimals) {
            cleansedAnimal.setCleansedStatus(true);

            this.cleansedAnimals.add(cleansedAnimal.getName());
        }
    }

    public void adopt(String adoptionCenterName) {
        ArrayList<Animal> animalsToAdopt = this.getAdoptionCenters().get(adoptionCenterName).getStoredAnimals().stream()
                .filter(Animal::getCleansedStatus)
                .collect(Collectors.toCollection(ArrayList<Animal>::new));

        for (Animal animal : animalsToAdopt) {
            this.getAdoptionCenters().get(adoptionCenterName).getStoredAnimals().remove(animal);
            this.adoptedAnimals.add(animal.getName());
        }
    }

    public void printStatistics() {
        StringBuilder adoptedAnimalsStr = new StringBuilder();

        this.adoptedAnimals = this.adoptedAnimals.stream()
                .sorted(Comparator.comparing(animal -> animal))
                .collect(Collectors.toCollection(ArrayList::new));

        if (this.adoptedAnimals.size() != 0) {
            for (String adoptedAnimal : this.adoptedAnimals) {
                adoptedAnimalsStr.append(adoptedAnimal).append(", ");
            }

            adoptedAnimalsStr = new StringBuilder(adoptedAnimalsStr.substring(0, adoptedAnimalsStr.length() - 2));
        } else {
            adoptedAnimalsStr.append("None");
        }

        StringBuilder cleansedAnimalsStr = new StringBuilder();

        this.cleansedAnimals = this.cleansedAnimals.stream()
                .sorted(Comparator.comparing(animal -> animal))
                .collect(Collectors.toCollection(ArrayList::new));

        if (cleansedAnimals.size() != 0) {
            for (String cleansedAnimal : this.cleansedAnimals) {
                cleansedAnimalsStr.append(cleansedAnimal).append(", ");
            }

            cleansedAnimalsStr = new StringBuilder(cleansedAnimalsStr.substring(0, cleansedAnimalsStr.length() - 2));
        } else {
            cleansedAnimalsStr.append("None");
        }

        System.out.printf("Paw Incorporative Regular Statistics%n" +
                        "Adoption Centers: %d%n" +
                        "Cleansing Centers: %d%n" +
                        "Adopted Animals: %s%n" +
                        "Cleansed Animals: %s%n" +
                        "Animals Awaiting Adoption: %d%n" +
                        "Animals Awaiting Cleansing: %d%n",
                this.getAdoptionCenters().size(),
                this.getCleansingCenters().size(),
                adoptedAnimalsStr,
                cleansedAnimalsStr,
                this.getAdoptionCenters().values().stream()
                        .mapToLong(center -> center.getStoredAnimals().stream().filter(Animal::getCleansedStatus).count()).sum(),
                this.getCleansingCenters().values().stream()
                        .mapToLong(center -> center.getStoredAnimals().stream().filter(animal -> !animal.getCleansedStatus()).count())
                        .sum()
        );
    }
}