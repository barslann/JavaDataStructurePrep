package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,0,55,1,-22,45};
        bubbleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSortAlgo(int[] arr){
        int unsortedIndex = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < unsortedIndex; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j , j+1);
                }
            }
            unsortedIndex--;
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

    i = 0 j = 0
    arr[1] > arr[2]

* 20,35,-15,7,55,1,-22
*                   |unsortedIndex
*
* 20,-15,35,7,55,1,-22
* 20,-15,7,35,55,1,-22
* 20,-15,7,35,1,55,-22
* 20,-15,7,35,1,-22,55
                 |
*
* 20,-15,7,35,1,-22,55
* -15,20,7,35,1,-22,55
* -15,7,20,35,1,-22,55
* -15,7,20,1,35,-22,55
* -15,7,20,1,-22,35,55
               |
*
    Bekir, 30
    Esra, 40
    Mehmet, 50
    Bekir, 25
    Esra, 15
    Mehmet 10

    Bekir, 30
    Bekir, 25
    Esra, 40
    Esta, 15
    Mehmet, 50
    Mehmet, 10


    Bekir, 25
    Bekir, 30
    Esta, 15
    Esra, 40
    Mehmet, 10
    Mehmet, 50

*
*
*
*
* */