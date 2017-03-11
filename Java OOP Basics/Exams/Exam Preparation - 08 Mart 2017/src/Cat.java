public class Cat extends Animal{
    private int intelligenceCoefficient;

    Cat(String name, int age, int intelligenceCoefficient) {
        super(name, age);
        this.setIntelligence(intelligenceCoefficient);
    }

    public final int getIntelligenceCoefficient() {
        return this.intelligenceCoefficient;
    }

    private void setIntelligence(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}