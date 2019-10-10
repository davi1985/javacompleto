package course.generics2.services;

import java.util.List;

public class CalculateService {
    /**
     * tipo comparavel T our qualquer superclasse de T
     */
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can be empty!");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0)
                max = item;
        }
        return max;
    }

}
