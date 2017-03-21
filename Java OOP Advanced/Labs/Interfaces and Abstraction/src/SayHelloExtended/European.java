package SayHelloExtended;

public class European extends BasePerson {
    private String name;

    European(String name) {
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
        return "Hello";
    }
}