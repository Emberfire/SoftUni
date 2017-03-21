package SayHello;

public class Bulgarian implements Person {
    private String name;

    Bulgarian(String name) {
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
        return "Здравей";
    }
}