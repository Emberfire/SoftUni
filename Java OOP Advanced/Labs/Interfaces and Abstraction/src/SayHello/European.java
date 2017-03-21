package SayHello;

public class European implements Person {
    private String name;

    public European(String name) {
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