package ArrayPracticeAssignment;

public class ArrayLoopMultiply {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter 5 elements in array : " );
        for(int i = 0; i <arr.length; i++){
            arr[i] = i;
            System.out.println("Value of array :" +arr[i]);
            arr[i] *= 2;
            System.out.println(" value of an array multuplied by 2  : " +arr[i]);
        }
    }
}
