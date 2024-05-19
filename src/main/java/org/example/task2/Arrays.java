package org.example.task2;

public class Arrays {
    public static <T> boolean compareArrays(T[] arr, T[] arr2) {
        boolean  isTheLengthsEquals = arr.length == arr2.length;
        boolean isTheClassEquals = arr.getClass().getName().equals(arr2.getClass().getName());
        return isTheLengthsEquals && isTheClassEquals;
    }
}
