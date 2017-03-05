import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();
        int newID = 1;

        String command = console.readLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    bankAccounts.put(newID, new BankAccount());
                    System.out.printf("Account ID%d created%n", newID);

                    newID++;
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Integer.parseInt(tokens[2]);

                    if (!bankAccounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                        break;
                    }

                    bankAccounts.get(id).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterest(interest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (!bankAccounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                        break;
                    }
                    System.out.printf("%.2f%n", bankAccounts.get(id).getInterest(years));
                    break;
            }

            command = console.readLine();
        }
    }
}