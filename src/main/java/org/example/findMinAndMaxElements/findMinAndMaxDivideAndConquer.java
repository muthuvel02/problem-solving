package org.example.findMinAndMaxElements;

class Pair {
    public int min;
    public int max;
}

public class findMinAndMaxDivideAndConquer {
    public static void main(String[] args) {
        int [] array = {39,55,22,56,97,339,448,4475};

        Pair minMax = findMinMax(array ,0, array.length-1);
        System.out.println("Min = " + minMax.min);
        System.out.println("Max = " + minMax.max);


    }

    public static Pair findMinMax(int []array , int low, int high)
    {
        Pair minMax = new Pair();

        // if there is only one element
        if(low == high){
            minMax.min = array[low];
            minMax.max = array[low];
            return minMax;
        }
        // if there are only two elements
        if(high == low+1){
            if(array[low] < array[high])
            {
                minMax.min = array[low];
                minMax.max = array[high];
            }
            else {
                minMax.min = array[high];
                minMax.max = array[low];
            }
            return minMax;
        }
        // if more than two elements
        int mid = (low +high) / 2;
        Pair leftMinMax = findMinMax(array, low, mid);
        Pair rightMinMax = findMinMax(array ,mid+1, high);

        //combine the result
        minMax.min = Math.min(leftMinMax.min,rightMinMax.min);
        minMax.max = Math.max(leftMinMax.max, rightMinMax.max);

        return minMax;
    }
}
