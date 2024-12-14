package ArrayPracticeAssignment;

public class ArrayPrintExceptIndexTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if(i!=2) {
                System.out.println("Array at index :"+ i + " Value: "  + arr[i]);
            }
        }
    }
}
