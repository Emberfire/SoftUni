package GenericSwapMethodInteger;

import java.util.ArrayList;

public class GenericBox<T> {
    private ArrayList<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
    }

    public void add(T item) {
        this.list.add(item);
    }

    public void swap(int item1Place, int item2Place) {
        T tempItem = this.list.get(item1Place);
        this.list.set(item1Place, this.list.get(item2Place));
        this.list.set(item2Place, tempItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object t : this.list) {
            sb.append(String.format("%s: %s%n", t.getClass().getName(), t));
        }

        return sb.toString();
    }
}