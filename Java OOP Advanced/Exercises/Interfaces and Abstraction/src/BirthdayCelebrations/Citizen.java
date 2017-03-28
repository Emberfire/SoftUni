package BirthdayCelebrations;

class Citizen implements Identifiable, Birthable {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public Citizen(String id, String name, String age, String birthday) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setBirthday(birthday);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}