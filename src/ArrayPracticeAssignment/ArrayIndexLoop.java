package ArrayPracticeAssignment;

import java.util.Scanner;

public class ArrayIndexLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter 5 elements in array : " );
        for(int i = 0; i <arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}
