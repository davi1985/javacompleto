package course.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    // generics
    private List<T> list = new ArrayList<>();

    //add value in list
    public void addValue(T value) {
        list.add(value);
    }

    // get first element in list
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    // print all elements
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
