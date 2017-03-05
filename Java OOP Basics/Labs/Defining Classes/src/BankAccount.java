public class BankAccount {
    private final static double DEFAULT_INTEREST = 0.02;

    private static double rate = DEFAULT_INTEREST;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = ++id;
    }

    public static void setInterest(double interest) {
        rate = interest;
    }

    public double getInterest(int years) {
        return this.balance * years * rate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "ID" + this.id;
    }
}