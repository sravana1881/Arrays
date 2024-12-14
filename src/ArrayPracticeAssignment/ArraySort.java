package ArrayPracticeAssignment;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr={4,2,9,13,1,0};
        Arrays.sort(arr);
        System.out.println("Array in sorting order : " + Arrays.toString(arr));
        System.out.println("minimum Value : " +arr[0]);
        System.out.println("maximum value : "  +arr[arr.length-1]);

    }
}
