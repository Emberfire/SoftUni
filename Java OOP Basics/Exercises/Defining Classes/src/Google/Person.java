package Google;

import java.util.ArrayList;

class Person {
    private String name;
    private Company company;
    private Car car;
    private ArrayList<Pokemon> pokemon;
    private ArrayList<Parent> parents;
    private ArrayList<Children> children;

    Person(String name) {
        this.name = name;
        this.pokemon = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    void setCompany(Company company) {
        this.company = company;
    }

    String getName() {
        return this.name;
    }

    void setPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    void setCar(Car car) {
        this.car = car;
    }

    void setParents(Parent parent) {
        this.parents.add(parent);
    }

    void setChildren(Children children) {
        this.children.add(children);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append(this.getName()).append("\r\n");

        out.append("Company:").append("\r\n");
        if (this.company != null) {
            out.append(String.format("%s %s %.2f%n",
                    this.getCompany().getName(), this.company.getDepartment(), this.company.getSalary()));
        }

        out.append("Car:").append("\r\n");
        if (this.car != null) {
            out.append(String.format("%s %s%n", this.getCar().getModel(), this.getCar().getSpeed()));
        }

        out.append("Pokemon:").append("\r\n");
        for (Pokemon pokemon : this.getPokemons()) {
            out.append(String.format("%s %s%n", pokemon.getName(), pokemon.getType()));
        }

        out.append("Parents:").append("\r\n");
        for (Parent parent : this.getParents()) {
            out.append(String.format("%s %s%n", parent.getName(), parent.getBirthday()));
        }

        out.append("Children:").append("\r\n");
        for (Children child : this.getChildren()) {
            out.append(String.format("%s %s%n", child.getName(), child.getBirthday()));
        }

        return out.toString();
    }

    Company getCompany() {
        return this.company;
    }

    Car getCar() {
        return this.car;
    }

    ArrayList<Pokemon> getPokemons() {
        return this.pokemon;
    }

    ArrayList<Parent> getParents() {
        return this.parents;
    }

    ArrayList<Children> getChildren() {
        return this.children;
    }
}