package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,0, -100, 7,55,-22,76};
        insertSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSortAlgo(int[] arr){
//        int sortedIdx = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int unsortedIdx = sortedIdx+1; unsortedIdx < arr.length; unsortedIdx++) {
//                if(arr[unsortedIdx] > arr[sortedIdx]) {
//                    sortedIdx++;
//                }else{
//                    int tempSortedIdx = sortedIdx;
//                    int tempUnsortedIDx = unsortedIdx;
//                    while(tempSortedIdx >= 0 && arr[tempUnsortedIDx] < arr[tempSortedIdx]){
//                        swap(arr,  tempUnsortedIDx, tempSortedIdx);
//                        tempSortedIdx--;
//                        tempUnsortedIDx--;
//                    }
//                    sortedIdx++;
//                }
//
//            }
//        }

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
    }

}

/*
* sortedIdx  = 1;
* unsortedIdx = 2;
* -15,20,35,7,55,-22
*
*
*
*
* */
