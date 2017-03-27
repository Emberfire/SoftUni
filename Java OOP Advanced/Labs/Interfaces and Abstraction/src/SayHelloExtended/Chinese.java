package SayHelloExtended;

class Chinese extends BasePerson implements Person{
    private String name;

    Chinese(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}