public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansingStatus;

    protected Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setCleansedStatus(false);
    }

    public final String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public final int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public final boolean getCleansedStatus() {
        return this.cleansingStatus;
    }

    public final void setCleansedStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }
}