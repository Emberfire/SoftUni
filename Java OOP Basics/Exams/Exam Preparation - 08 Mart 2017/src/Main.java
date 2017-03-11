import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        AnimalCenterManager animalCenterManager = new AnimalCenterManager();

        String input = console.readLine();

        while (!input.equals("Paw Paw Pawah")) {
            String[] tokens = input.split(" \\| ");
            String command = tokens[0];
            switch (command) {
                case "RegisterCleansingCenter":
                    animalCenterManager.registerCleansingCenter(tokens[1]);
                    break;
                case "RegisterAdoptionCenter":
                    animalCenterManager.registerAdoptionCenter(tokens[1]);
                    break;
                case "RegisterDog":
                    animalCenterManager.registerDog(tokens[1], Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]), tokens[4]);
                    break;
                case "RegisterCat":
                    animalCenterManager.registerCat(tokens[1], Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]), tokens[4]);
                    break;
                case "SendForCleansing":
                    animalCenterManager.sendForCleansing(tokens[1], tokens[2]);
                    break;
                case "Cleanse":
                    animalCenterManager.cleanse(tokens[1]);
                    break;
                case "Adopt":
                    animalCenterManager.adopt(tokens[1]);
                    break;
            }

            input = console.readLine();
        }

        animalCenterManager.printStatistics();
    }
}