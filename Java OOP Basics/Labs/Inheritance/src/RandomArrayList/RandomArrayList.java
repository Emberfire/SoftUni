package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

class RandomArrayList extends ArrayList{
    private Random random;

    public RandomArrayList() {
        this.setRandom();
    }

    Object getRandomElement() {
        Object randomElement = super.get(random.nextInt(super.size()));
        super.remove(randomElement);
        return randomElement;
    }

    private void setRandom() {
        this.random = new Random();
    }
}