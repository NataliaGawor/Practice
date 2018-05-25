package Kata;

import java.util.Arrays;

public class EvenIndex {
    public static int find(int[] arr) {
        int leftSum, rightSum;
        int end = arr.length;

        for(int index = 0; index<end; index++){
            leftSum = Arrays.stream(Arrays.copyOfRange(arr, 0, index)).sum();
            rightSum = Arrays.stream(Arrays.copyOfRange(arr, index + 1, end)).sum();
            if(leftSum == rightSum) return index;
        }
        return -1;
    }
}
