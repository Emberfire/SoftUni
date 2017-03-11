package MordorsCrueltyPlan;

public class Food {
    private int foodHappiness;

    public Food(int happiness) {
        this.setFoodHappiness(happiness);
    }

    public Food() {

    }

    private void setFoodHappiness(int happiness) {
        this.foodHappiness = happiness;
    }

    int getFoodHappiness() {
        return this.foodHappiness;
    }
}