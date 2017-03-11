import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public abstract class AnimalCenterManager {
    private HashMap<String, AdoptionCenter> adoptionCenters;
    private HashMap<String, CleansingCenter> cleansingCenters;

    private ArrayList<String> adoptedAnimals;
    private ArrayList<String> cleansedAnimals;


    AnimalCenterManager(String name) {
        this.setAdoptedAnimals(new ArrayList<>());
        this.setCleansedAnimals(new ArrayList<>());
        this.setAdoptionCenters(new HashMap<>());
        this.setCleansingCenters(new HashMap<>());
    }

    public void registerCleansingCenter(String name) {
        this.addCleansingCenter(new CleansingCenter(name));
    }

    public void addCleansingCenter(CleansingCenter cleansingCenter) {
        this.cleansingCenters.put(cleansingCenter.getName(), cleansingCenter);
    }

    public void registerAdoptionCenter(String name) {
        this.addAdoptionCenter(new AdoptionCenter(name));
    }

    public void addAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenters.put(adoptionCenter.getName(), adoptionCenter);
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
        this.cleansingCenters.get(cleansingCenterName).getStoredAnimals().forEach(animal -> animal.setCleansedStatus(true));
    }

    public void setAdoptionCenters(HashMap<String, AdoptionCenter> adoptionCenters) {
        this.adoptionCenters = adoptionCenters;
    }

    public void setCleansingCenters(HashMap<String, CleansingCenter> cleansingCenters) {
        this.cleansingCenters = cleansingCenters;
    }

    public void setAdoptedAnimals(ArrayList<String> adoptedAnimals) {
        this.adoptedAnimals = adoptedAnimals;
    }

    public void setCleansedAnimals(ArrayList<String> cleansedAnimals) {
        this.cleansedAnimals = cleansedAnimals;
    }
}