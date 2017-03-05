class BankAccount {
    private int id;
    private double balance;

    public void withdraw(double balance) {
        if (this.balance < balance) {
            throw new IllegalStateException("Insufficient amount!");
        }

        this.balance -= balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    int getId() {
        return this.id;
    }

    double getBalance() {
        return this.balance;
    }

    void setId(int id) {
        this.id = id;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}