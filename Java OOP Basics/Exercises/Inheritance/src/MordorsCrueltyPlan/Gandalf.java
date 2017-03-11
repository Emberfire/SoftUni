package MordorsCrueltyPlan;

class Gandalf {
    private int happiness;

    Gandalf() {

    }

    void eat(Food food) {
        this.happiness += food.getFoodHappiness();
    }

    int getHappiness() {
        return this.happiness;
    }

    String getMood() {
        if (this.getHappiness() < -5) {
            return "Angry";
        } else if (this.getHappiness() >= -5 && this.getHappiness() < 0) {
            return "Sad";
        } else if (this.getHappiness() >= 0 && this.getHappiness() <= 15) {
            return "Happy";
        } else {
            return "JavaScript";
        }
    }
}