package ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] createCommand = console.readLine().split(" ");
        String[] items = new String[createCommand.length - 1];

        System.arraycopy(createCommand, 1, items, 0, createCommand.length - 1);

        ListyIterator<String> listyIterator = new ListyIterator<String>(items);

        String command = console.readLine();
        while (!command.equals("END")) {
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }

            command = console.readLine();
        }
    }
}