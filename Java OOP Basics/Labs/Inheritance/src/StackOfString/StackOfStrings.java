package StackOfString;

import java.util.ArrayList;

class StackOfStrings{
    private ArrayList<String> data;

    StackOfStrings() {
        this.data = new ArrayList<>();
    }

    void push(String item) {
        data.add(item);
    }

    String pop() {
        String deletedItem = this.data.remove(0);
        return deletedItem;
    }

    String peek() {
        return this.data.get(0);
    }

    boolean isEmpty() {
        return this.data.isEmpty();
    }
}