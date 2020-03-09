package com.sparta.crss;

import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;

public class CombineAndSortArrays {

//     public int[] CombineAndSortArrays(int[] inputArray1, int[] inputArray2) {
//         int[] combinedArray = new int[inputArray1.length + inputArray2.length];
//         System.arraycopy(inputArray1, 0, combinedArray, 0, inputArray1.length);
//         System.arraycopy(inputArray2, 0, combinedArray, inputArray1.length, inputArray2.length);
//         //System.out.println(Arrays.toString(combinedArray));
//         Arrays.sort(combinedArray);
//         return combinedArray;
//     }

    public int[] CombineSortedArrays(int[] inputArray1, int[] inputArray2) {
//        checking arrays are sorted - half-finished
//        int[] sortedInputArray1 = inputArray1;
//        Arrays.sort(sortedInputArray1);
//        int[] sortedInputArray2 = inputArray2;
//        Arrays.sort(sortedInputArray2);
//        System.out.println(Arrays.toString(inputArray1));0
//        System.out.println(Arrays.toString(sortedInputArray1));
//        return inputArray1;
        int[] resultArray = new int[inputArray1.length + inputArray2.length];
        //ArrayList<int> resultArrayList = new ArrayList<int>();
        //List<int> resultList = new List<int>();
        int resultArrayIndex = 0;
//        for (int i = 0; i < inputArray1.length; i++) {
//            for (int j = 0; j < inputArray2.length; j++) {
//                if (inputArray1[i] < inputArray2[j]) {
//                    resultArray[resultArrayIndex] = inputArray1[i];
//                } else {
//                    resultArray[resultArrayIndex] = inputArray2[j];
//                }
//                resultArrayIndex++;
//            }
//        }
        int inputArray1Index = 0;
        int inputArray2Index = 0;
//        while (inputArray1Index < inputArray1.length && inputArray2Index < inputArray2.length && resultArrayIndex < resultArray.length) {
//        while (inputArray1Index < inputArray1.length || inputArray2Index < inputArray2.length || resultArrayIndex < resultArray.length) {
//        while (resultArrayIndex < resultArray.length) {
        while (inputArray1Index < inputArray1.length && inputArray2Index < inputArray2.length) {
            if (inputArray1[inputArray1Index] < inputArray2[inputArray2Index]) {
                resultArray[resultArrayIndex] = inputArray1[inputArray1Index];
                resultArrayIndex++;
                inputArray1Index++;
            } else {
                resultArray[resultArrayIndex] = inputArray2[inputArray2Index];
                resultArrayIndex++;
                inputArray2Index++;
            }
        }
        // adds the rest of the remaining array
        if (inputArray1Index < inputArray1.length) {
            for (int i = 0; i < inputArray1.length - inputArray1Index; i++) {
                resultArray[resultArrayIndex] = inputArray1[inputArray1Index + i];
                resultArrayIndex++;
            }
        }
        if (inputArray2Index < inputArray2.length) {
            for (int i = 0; i < inputArray2.length - inputArray2Index; i++) {
                resultArray[resultArrayIndex] = inputArray2[inputArray2Index + i];
                resultArrayIndex++;
            }
        }
//        int i = 0;
//        while (inputArray1Index < inputArray1.length) {
//            resultArray[resultArrayIndex] = inputArray1[inputArray1Index + i];
//            i++;
//        }
//        int j = 0;
//        while (inputArray2Index < inputArray2.length) {
//            resultArray[resultArrayIndex] = inputArray2[inputArray2Index + j];
//            j++;
//        }
        return resultArray;
    }

    //public int[] mergeSort(int[] inputArray) {
        //steps:
        //check if length is more than two
        //if yes, split
        //repeat etc.
        //if it is one, leave it
        //if it is two, check which number is bigger
        //if the left is larger, swap

        //int inputArrayLength = inputArray.length;
        //int[][] sortedArraysArray;

        //if ()
    //}

    public int[] divideArray(int[] inputArray) {
        //int[][] arrayInHalf = new int[][];
        int inputArrayLength = inputArray.length;
        if (inputArrayLength > 2) {
            int midpoint = inputArrayLength / 2;
            int[] left = new int[midpoint];
            int[] right = new int[inputArrayLength - midpoint];
            for (int i = 0; i < midpoint; i++) {
                left[i] = inputArray[i];
            }
            for (int i = midpoint; i < inputArrayLength; i++) {
                right[i - midpoint] = inputArray[i];
            }
            if (left.length < 3 && right.length < 3) {
                int[] sortedLeft = sortTwoNumbers(left);
                int[] sortedRight = sortTwoNumbers(right);
                int[] combinedArrays = CombineSortedArrays(sortedLeft, sortedRight);
                return combinedArrays;
            } else {
                //TODO: come back to this
//                int[] placeholder = {1, 2};
//                return placeholder;
                int[] newLeftArray = divideArray(left);
                int[] newRightArray = divideArray(right);
                return CombineSortedArrays(newLeftArray, newRightArray);
                //for testing purposes:
                //return newRightArray;
            }
        } else {
            return sortTwoNumbers(inputArray);
        }
    }

    public int[] sortTwoNumbers(int[] array) {
        if (array.length == 1) {
            return array;
        } else if (array.length == 2) {
            int temp = 0;
            if (array[1] < array[0]) {
                temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
        }
        return array;
    }

    public int[] mergeSort(int[] inputArray) {
        int inputArrayLength = inputArray.length;
        if (inputArrayLength > 2) {
            return divideArray(inputArray);
        }
        //?
        else {
            return inputArray;
        }
    }
}
