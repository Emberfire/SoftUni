package FoodShortage;

abstract class BaseEntry implements Buyer {
    private String name;
    private String age;
    private int foodBought;

    protected BaseEntry(String name, String age) {
        this.setName(name);
        this.setAge(age);
    }

    String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    String getAge() {
        return this.age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    Integer getFoodBought() {
        return this.foodBought;
    }

    void setFoodBought(int foodBought) {
        this.foodBought = foodBought;
    }
}