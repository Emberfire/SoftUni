package Google;

class Parent {
    private String name;
    private String birthday;

    Parent(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    String getName() {
        return this.name;
    }

    String getBirthday() {
        return this.birthday;
    }
}