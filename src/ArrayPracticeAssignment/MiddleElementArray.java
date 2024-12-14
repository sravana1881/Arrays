package ArrayPracticeAssignment;

import java.util.Scanner;

public class MiddleElementArray {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 68, 2};
        System.out.println("Middle element is : " +findMiddleElement(arr));
        }
    public static int findMiddleElement(int[] arr) {
        // Find the index of the middle element
        int middleIndex = arr.length / 2;
        return arr[middleIndex];
    }

}





