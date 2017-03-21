package SayHelloExtended;

public class Chinese extends BasePerson {
    private String name;

    Chinese(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}