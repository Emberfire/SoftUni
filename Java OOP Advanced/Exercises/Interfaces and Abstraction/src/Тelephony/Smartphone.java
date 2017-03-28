package Тelephony;

class Smartphone implements Phoneable, Browsable {

    @Override
    public String phone(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid number!");
            }
        }

        return String.format("Calling... %s", number);
    }

    @Override
    public String browse(String site) {
        for (char c : site.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Invalid URL!");
            }
        }

        return String.format("Browsing: %s!", site);
    }
}