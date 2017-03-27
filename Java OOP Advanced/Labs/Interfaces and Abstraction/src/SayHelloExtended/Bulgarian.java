package SayHelloExtended;

class Bulgarian extends BasePerson implements Person{
    private String name;

    Bulgarian(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Здравей";
    }
}