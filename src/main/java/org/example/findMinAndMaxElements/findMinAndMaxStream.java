package org.example.findMinAndMaxElements;

import java.util.Arrays;

public class findMinAndMaxStream {
    public static void main(String[] args) {
        int [] array = {39,55,22,56,97,339,448,4475};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
