package Google;

class Pokemon {
    private String name;
    private String type;

    Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }
}