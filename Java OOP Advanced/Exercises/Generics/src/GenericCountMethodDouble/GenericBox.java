package GenericCountMethodDouble;

import java.util.ArrayList;

public class GenericBox<T extends Comparable<T>> {
    private ArrayList<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
    }

    public void add(T item) {
        this.list.add(item);
    }

    public  Integer count(T item) {
        int count = 0;
        for (T t : this.list) {
            if (item.compareTo(t) < 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : this.list) {
            sb.append(String.format("%s: %s%n", t.getClass().getName(), t));
        }

        return sb.toString();
    }
}