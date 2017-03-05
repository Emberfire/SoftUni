package PokemonTrainer;

class Pokemon {
    private String name;
    private String element;
    private int health;

    Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    void hit() {
        this.health -= 10;
        if (this.health <= 0) {
            throw new IllegalStateException();
        }
    }

    String getElement() {
        return this.element;
    }

    int getHealth() {
        return this.health;
    }
}