package Sorting;

import java.util.Arrays;

public class SelectionSort {
    // pass by value  - primitive
    // pass by reference - reference
    public static void main(String[] args) {
        int[] arr = {4,35,3,-15,7,100,0,55,1,-22,45,-50};
        selectionSortAlgo(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSortAlgo(int[] arr){
        for (int unsortedIndex = arr.length-1; unsortedIndex > 0; unsortedIndex--) { // eleman sayisi kadar calisiyor
            int maxIdx = 0;
            for (int j = 1; j <= unsortedIndex; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            swap(arr, maxIdx , unsortedIndex);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        if(arr[i] == arr[j]) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
*   int maxIdx = 0;
*
*20,35,-15,7,0,55,1,-22,45
*                        |
*
* j = 1;
*
* */
