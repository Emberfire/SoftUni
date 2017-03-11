import java.util.ArrayList;

public abstract class Center {
    private String name;
    private ArrayList<Animal> storedAnimals;

    Center(String name) {
        this.setName(name);
        this.setStoredAnimals(new ArrayList<>());
    }

    String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getStoredAnimals() {
        return this.storedAnimals;
    }

    private void setStoredAnimals(ArrayList<Animal> storedAnimals) {
        this.storedAnimals = storedAnimals;
    }
}