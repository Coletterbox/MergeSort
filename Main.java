package com.sparta.crss;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CombineAndSortArrays combineAndSortArrays = new CombineAndSortArrays();
//        int[] array1 = {3, 5, 9, 2, 5};
//        int[] array2 = {7, 3, 9};
//        System.out.println(Arrays.toString(combineAndSortArrays.CombineAndSortArrays(array1, array2)));
        int[] array3 = {1, 3, 4, 5};
        int[] array4 = {6, 7, 8};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array3, array4)));
        int[] array5 = {1, 2, 4, 5, 7};
        int[] array6 = {6, 7, 8};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array5, array6)));
        int[] array7 = {1, 2, 4, 4, 7};
        int[] array8 = {6, 9, 10};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array7, array8)));
        int[] array9 = {2, 2, 4, 4, 7, 8, 9, 11, 13, 15};
        int[] array10 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array9, array10)));
        int[] array11 = {1, 2, 4, 4, 7};
        int[] array12 = {6, 9, 10, 11, 12, 13};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array11, array12)));
        int[] array13 = {6, 9, 10, 11, 12, 13};
        int[] array14 = {1, 2, 4, 4, 7};
        System.out.println(Arrays.toString(combineAndSortArrays.CombineSortedArrays(array13, array14)));
        int[] unsortedArray = {4, 7, 2, 7, 4, 8, 9, 3};
        System.out.println(Arrays.toString(combineAndSortArrays.mergeSort(unsortedArray)));
        int[] unsortedArray2 = {4, 7, 2, 7};
        System.out.println(Arrays.toString(combineAndSortArrays.mergeSort(unsortedArray2)));
        int[] unsortedArray3 = {4, 7, 2, 7, 3, 1, 2, 6, 7, 10, 11, 1};
        System.out.println(Arrays.toString(combineAndSortArrays.mergeSort(unsortedArray3)));
    }
}
