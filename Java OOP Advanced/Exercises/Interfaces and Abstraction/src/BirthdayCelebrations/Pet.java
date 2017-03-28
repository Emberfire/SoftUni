package BirthdayCelebrations;

public class Pet implements Birthable {
    private String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
    }

    String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}