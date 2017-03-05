package FragileBaseClass;

import java.util.ArrayList;
import java.util.Collections;

class Animal {
    protected ArrayList<Food> foodEaten;

    Animal() {
        this.foodEaten = new ArrayList<>();
    }

    final void eat(Food food) {
        this.foodEaten.add(food);
    }

    void eatAll(Food[] food) {
        Collections.addAll(this.foodEaten, food);
    }
}