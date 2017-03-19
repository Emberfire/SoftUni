package ShapesDrawing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < 2; i++) {
            queue.add(Integer.parseInt(console.readLine()));
        }

        Drawable circle = new Circle(queue.poll(), queue.poll(), queue.poll());
        Drawable rectangle = new Rectangle(queue.poll(),  queue.poll());

        circle.draw();
        rectangle.draw();
    }
}