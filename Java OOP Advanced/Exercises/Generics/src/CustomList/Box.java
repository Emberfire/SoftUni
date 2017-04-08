package CustomList;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        T elementTemp = this.list.get(index1);
        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, elementTemp);
    }

    public int countGreaterThan(T element) {
        int count = 0;

        for (T t : list) {
            if (element.compareTo(t) < 0) {
                count++;
            }
        }

        return count;
    }

    public T getMax () {
        if (this.list.isEmpty()) {
            throw new IllegalStateException("List should not be empty!");
        }

        T max = this.list.get(0);

        for (int i = 1; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(max) > 0) {
                max = this.list.get(i);
            }
        }

        return max;
    }

    public T getMin () {
        if (this.list.isEmpty()) {
            throw new IllegalStateException("List should not be empty!");
        }

        T min = this.list.get(0);

        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(min) < 0) {
                min = this.list.get(i);
            }
        }

        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element : this.list) {
            sb.append(element).append("\n");
        }

        return sb.toString();
    }
}