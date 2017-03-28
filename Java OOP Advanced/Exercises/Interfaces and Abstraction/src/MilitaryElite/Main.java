package MilitaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        List<Soldier> military = new ArrayList<>();
        Map<String, Soldier> privates = new HashMap<>();

        String command = console.readLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String type = tokens[0];
            switch (type) {
                case "Private":
                    String id = tokens[1];
                    String firstName = tokens[2];
                    String lastName = tokens[3];
                    Double salary = Double.parseDouble(tokens[4]);
                    Soldier _private = new Private(id, firstName, lastName, salary);
                    military.add(_private);
                    privates.put(_private.getId(), _private);
                    break;
                case "LeutenantGeneral":
                    id = tokens[1];
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);
                    LeutenantGeneral leutenantGeneral = new LeutenantGeneral(id, firstName, lastName, salary);
                    for (int i = 5; i < tokens.length; i++) {
                        String privateId = tokens[i];
                        leutenantGeneral.addSoldier(privates.get(privateId));
                    }

                    military.add(leutenantGeneral);
                    privates.put(id, leutenantGeneral);
                    break;
                case "Engineer":

                    id = tokens[1];
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);
                    String corps = tokens[5];
                    Engineer engineer;
                    try {
                        engineer = new Engineer(id, firstName, lastName, salary, corps);
                    } catch (IllegalArgumentException ex) {
                        break;
                    }

                    for (int i = 6; i < tokens.length; i += 2) {
                        String repairName = tokens[i];
                        int repairHours = Integer.parseInt(tokens[i + 1]);
                        Repair repair = new Repair(repairName, repairHours);
                        engineer.addRepair(repair);
                    }

                    military.add(engineer);
                    privates.put(id, engineer);
                    break;
                case "Commando":
                    Commando commando;
                    id = tokens[1];
                    firstName = tokens[2];
                    lastName = tokens[3];
                    salary = Double.parseDouble(tokens[4]);
                    corps = tokens[5];
                    try {
                        commando = new Commando(id, firstName, lastName, salary, corps);
                    } catch (IllegalArgumentException ex) {
                        break;
                    }

                    for (int i = 6; i < tokens.length; i += 2) {
                        String missionName = tokens[i];
                        String missionState = tokens[i + 1];
                        try {
                            Mission mission = new Mission(missionName, missionState);
                            commando.addMission(mission);
                        } catch (IllegalArgumentException ex) {
                        }
                    }

                    privates.put(id, commando);
                    military.add(commando);
                    break;
                case "Spy":
                    id = tokens[1];
                    firstName = tokens[2];
                    lastName = tokens[3];
                    String codeNumber = tokens[4];
                    Soldier spy = new Spy(id, firstName, lastName, codeNumber);
                    military.add(spy);
                    break;
            }

            command = console.readLine();
        }

        for (Soldier soldier : military) {
            System.out.println(soldier);
        }
    }
}