package Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> numbers;

    public Lake() {
        this.setNumbers(new ArrayList<>());
    }

    List<Integer> getNumbers() {
        return this.numbers;
    }

    private void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer> {
        private int index;
        private boolean isOnOdd;

        Frog() {
            this.index = 0;
            this.isOnOdd = false;
        }

        @Override
        public boolean hasNext() {
            if (isOnOdd && index > numbers.size() - 1) {
                return false;
            }
            return index < numbers.size();
        }

        @Override
        public Integer next() {
            return numbers.get(index++);
        }
    }
}