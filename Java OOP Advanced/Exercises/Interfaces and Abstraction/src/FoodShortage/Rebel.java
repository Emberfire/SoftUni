package FoodShortage;

class Rebel extends BaseEntry {
    private String group;
    private Integer foodBought;

    Rebel(String name, String age, String group) {
        super(name, age);
        this.setGroup(group);
    }

    @Override
    public void buyFood() {
        this.setFoodBought(this.getFoodBought() + 5);
    }

    private void setGroup(String group) {
        this.group = group;
    }
}