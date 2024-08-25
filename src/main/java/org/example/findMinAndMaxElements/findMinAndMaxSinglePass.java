package org.example.findMinAndMaxElements;

public class findMinAndMaxSinglePass {
    public static void main(String[] args) {
        int [] array = {39,55,22,56,97,339,448,4475};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i <array.length ; i++) {
            if(array[i] < min)
                min = array[i];
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        //T O(n) S O(1)
    }
}
