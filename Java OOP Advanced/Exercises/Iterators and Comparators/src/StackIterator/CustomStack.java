package StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomStack implements Iterable<Integer> {
    private List<Integer> items;

    CustomStack() {
        this.setItems(new ArrayList<>());
    }

    void push(int item) {
        this.getItems().add(item);

    }

    void pop() {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("No elements");
        }

        this.getItems().remove(this.getItems().size() -1);
    }

    private List<Integer> getItems() {
        return this.items;
    }

    private void setItems(List<Integer> items) {
        this.items = items;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomStackIterator();
    }

    private final class CustomStackIterator implements Iterator<Integer> {
        private int index;

        CustomStackIterator() {
            this.index = getItems().size() - 1;
        }

        @Override
        public boolean hasNext() {
            return this.index >= 0;
        }

        @Override
        public Integer next() {
            return getItems().get(index--);
        }
    }
}