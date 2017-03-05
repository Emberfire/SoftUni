package ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        double l = Double.parseDouble(console.readLine());
        double w = Double.parseDouble(console.readLine());
        double h = Double.parseDouble(console.readLine());
        Box box = new Box(l, w, h);

        //Class boxClass = Box.class;
//
        //Field[] fields = boxClass.getDeclaredFields();
//
        //System.out.println(Arrays.asList(fields)
//
        //        .stream()
//
        //        .filter(f -> Modifier.isPrivate(f.getModifiers())).count());

        System.out.printf("Surface Area - %.2f%n", box.calculateArea(l, w, h));
        System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralArea(l, w, h));
        System.out.printf("Volume - %.2f%n", box.calculateVolume(l, w, h));
    }
}
