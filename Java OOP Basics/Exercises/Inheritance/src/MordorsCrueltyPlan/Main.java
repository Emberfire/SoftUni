package MordorsCrueltyPlan;

import MordorsCrueltyPlan.FoodKinds.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Gandalf gandalf = new Gandalf();

        String[] foods = Arrays.stream(console.readLine().split("\\s+"))
                .map(String::trim)
                .toArray(String[]::new);

        for (String food : foods) {
            switch (food.toLowerCase()) {
                case "cram":
                    Cram cram = new Cram();
                    gandalf.eat(cram);
                    break;
                case "lembas":
                    Lembas lembas = new Lembas();
                    gandalf.eat(lembas);
                    break;
                case "apple":
                    Apple apple = new Apple();
                    gandalf.eat(apple);
                    break;
                case "melon":
                    Melon melon = new Melon();
                    gandalf.eat(melon);
                    break;
                case "mushrooms":
                    Mushrooms mushrooms = new Mushrooms();
                    gandalf.eat(mushrooms);
                    break;
                case "honeycake":
                    HoneyCake honeyCake = new HoneyCake();
                    gandalf.eat(honeyCake);
                    break;
                default:
                    EverythingElse everythingElse = new EverythingElse();
                    gandalf.eat(everythingElse);
                    break;
            }
        }

        System.out.println(gandalf.getHappiness());
        System.out.println(gandalf.getMood());
    }
}