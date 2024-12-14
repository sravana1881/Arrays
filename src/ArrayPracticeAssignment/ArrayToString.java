package ArrayPracticeAssignment;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
         String[] colors = {"red","green","blue","yellow"};
         System.out.println("length of the colors :" +colors.length);
         String[] copiedcolors = colors.clone();
         System.out.println("length of the copiedcolors :" +copiedcolors.length);
         System.out.println("Copied Colors : "+ Arrays.toString(copiedcolors));
    }
}
