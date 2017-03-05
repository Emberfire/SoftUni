import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        String input = console.readLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    int id  = Integer.valueOf(tokens[1]);
                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        BankAccount account = new BankAccount();
                        account.setId(id);
                        accounts.put(id, account);
                    }

                    break;
                case "Deposit":
                    id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        accounts.get(id).deposit(amount);
                    }

                    break;
                case "Withdraw":
                    id = Integer.parseInt(tokens[1]);
                    amount = Double.parseDouble(tokens[2]);

                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        try {
                            accounts.get(id).withdraw(amount);
                        } catch (IllegalStateException exception) {
                            System.out.println("Insufficient balance");
                        }
                    }

                    break;
                case "Print":
                    id = Integer.parseInt(tokens[1]);
                    if (!accounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(String.format("Account %s, balance %.2f", accounts.get(id), accounts.get(id).getBalance()));
                    }

                    break;
            }
            input = console.readLine();
        }
    }
}