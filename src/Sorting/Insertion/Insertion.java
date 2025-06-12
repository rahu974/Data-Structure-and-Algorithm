package Sorting.Insertion;

//Builds the final sorted array one item at a time.

import java.util.*;

public class Insertion {
    public static void Insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;


            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 3};
        Insert(arr);
    }
}
