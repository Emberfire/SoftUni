package SingleInheritance;

class Child extends Person {
    Child(String name, int age) {
        super(name, age);
    }

    @Override
    void setAge(int age) {
        if (age <= 15) {
            super.setAge(age);
        } else {
            throw new IllegalArgumentException("Child’s age must be less than 15!");
        }
    }
}