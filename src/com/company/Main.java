package com.company;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 48, 89, 65, 84, 66, 120, 78, 15, 45, 123, 98);
        integers.stream()
                .filter(x -> x % 2 == 0)
                .map(v -> v * v)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
}