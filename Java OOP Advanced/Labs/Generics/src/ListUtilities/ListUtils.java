package ListUtilities;

import java.util.List;

public class ListUtils<T> {


    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List should not be empty!");
        }

        T minItem = list.get(0);

        for (T aList : list) {
            if (minItem.compareTo(aList) > 0) {
                minItem = aList;
            }
        }

        return minItem;
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List should not be empty!");
        }

        T maxItem = list.get(0);

        for (T aList : list) {
            if (maxItem.compareTo(aList) < 0) {
                maxItem = aList;
            }
        }

        return maxItem;
    }
}