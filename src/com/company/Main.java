package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> list = new ArrayList<>(intList);
        Iterator<Integer> iteratorList = list.iterator();
        while (iteratorList.hasNext()) {
            int a = iteratorList.next();
            if (a % 2 != 0 || a <= 0) {
                iteratorList.remove();
            }
        }
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
