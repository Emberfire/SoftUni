package FoodShortage;

class Citizen extends BaseEntry implements Identifiable, Birthable {
    private String id;
    private String birthday;
    private int foodBought;

    public Citizen(String id, String name, String age, String birthday) {
        super(name, age);
        this.setId(id);
        this.setBirthday(birthday);
    }

    @Override
    public void buyFood() {
        this.setFoodBought(this.getFoodBought() + 10);
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {

        this.id = id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getFoodBought() {
        return this.foodBought;
    }

    private void setFoodBought(Integer foodBought) {
        this.foodBought = foodBought;
    }
}