package ListyIterator;

class ListyIterator<T extends String> {
    private T[] items;
    private int index;

    @SafeVarargs
    ListyIterator(T... items) {
        this.setItems(items);
        this.setIndex();
    }

    boolean move() {
        if (this.getIndex() == this.getItems().length - 1) {
            return false;
        }

        this.index++;
        return true;
    }

    void print() {
        if (this.getItems().length == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(items[index]);
    }

    boolean hasNext() {
        return this.getIndex() != this.getItems().length - 1;
    }

    private T[] getItems() {
        return this.items;
    }

    private void setItems(T[] items) {
        this.items = items;
    }

    private int getIndex() {
        return this.index;
    }

    private void setIndex() {
        this.index = 0;
    }
}