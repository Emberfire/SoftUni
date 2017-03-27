package SayHelloExtended;

interface Person {

    String getName();

    default String sayHello() {
        return "Hello";
    }
}