package ArrayPracticeAssignment;

import java.util.Scanner;

public class IndexElementArray {
        public static void main(String[] args) {

            int[] arr = {23, 24, 25, 26, 27};
            System.out.println(arr.length);
            System.out.println(arr[0]);
            System.out.println(arr[arr.length - 1]);
            try {
                System.out.println("Value at index : " +arr[arr[arr.length]]);
            } catch (Exception e) {
                System.out.println("Exception message is : " +e);
                throw new RuntimeException(e);

            }
        }
            }



