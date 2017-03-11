package WildFarm;

import WildFarm.Animal.Cat;
import WildFarm.Animal.Mouse;
import WildFarm.Animal.Tiger;
import WildFarm.Animal.Zebra;
import WildFarm.Food.Food;
import WildFarm.Food.Meat;
import WildFarm.Food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String command = console.readLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String animalType = tokens[0];
            String animalName = tokens[1];
            double animalWeight = Double.parseDouble(tokens[2]);
            String animalLivingRegion = tokens[3];
            String animalBreed = null;
            if (animalType.equals("Cat")) {
                animalBreed = tokens[4];
            }

            tokens = console.readLine().split("\\s+");
            String foodType = tokens[0];
            int quantity = Integer.parseInt(tokens[1]);

            Food food;
            if (foodType.equals("Vegetable")) {
                food = new Vegetable(quantity);
            } else {
                food = new Meat(quantity);
            }

            switch (animalType) {

                case "Tiger":
                    Tiger tiger = new Tiger(animalType, animalName, animalWeight, animalLivingRegion);
                    tiger.makeSound();
                    try {
                        tiger.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }

                    System.out.println(tiger);
                    break;
                case "Mouse":
                    Mouse mouse = new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
                    mouse.makeSound();
                    try {
                        mouse.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }

                    System.out.println(mouse);
                    break;
                case "Cat":
                    Cat cat = new Cat(animalType, animalName, animalWeight, animalLivingRegion, animalBreed);
                    cat.makeSound();
                    cat.eat(food);
                    System.out.println(cat);
                    break;
                case "Zebra":
                    Zebra zebra = new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
                    zebra.makeSound();
                    try {
                        zebra.eat(food);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }

                    System.out.println(zebra);
                    break;
            }

            command = console.readLine();
        }
    }
}