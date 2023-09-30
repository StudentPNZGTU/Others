package com.mycompany.app;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {
    public static List<Integer> Sort(List<Integer> list) {
        if (list.size() < 2) {
            // base case, arrays with 0 or 1 element are already "sorted"
            return list;
        } else {
            // recursive case
            Integer pivot = list.get(0);

            // sub-array of all the elements less than the pivot
            List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                    .collect(Collectors.toList());

            // sub-array of all the elements greater than the pivot
            List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                    .collect(Collectors.toList());

            return Stream.of(
                            Sort(less).stream(),
                            Stream.of(pivot),
                            Sort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }
}