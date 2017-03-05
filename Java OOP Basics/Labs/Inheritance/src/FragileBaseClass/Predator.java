package FragileBaseClass;

class Predator extends Animal {
    private int health;

    void feed(Food food) {
        super.eat(food);
        this.health++;
    }

    void feedAll(Food[] food) {
        this.eatAll(food);
        this.health += food.length;
    }
}