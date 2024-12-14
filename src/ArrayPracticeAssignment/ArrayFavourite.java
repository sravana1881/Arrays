package ArrayPracticeAssignment;

import java.util.Scanner;

public class ArrayFavourite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] favourite = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favourite[i] = sc.nextLine();
        }
        System.out.println("\n Your favorite things are:");
        for (int i = 0; i < favourite.length; i++) {
            System.out.println((i + 1) + ". " + favourite[i]);
        }
        sc.close();
    }
}
