package GenericBox;

import java.util.ArrayList;

public class GenericBox<T> {
    private ArrayList<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
    }

    public void add(T item) {
        this.list.add(item);
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