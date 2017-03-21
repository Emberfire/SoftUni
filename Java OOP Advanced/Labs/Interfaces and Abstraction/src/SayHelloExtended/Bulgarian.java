package SayHelloExtended;

public class Bulgarian extends BasePerson {
    private String name;

    Bulgarian(String name) {
        this.setName(name);
    }


    @Override
    public String sayHello() {
        return "Здравей";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    protected void setName(String name) {
        this.name = name;
    }
}