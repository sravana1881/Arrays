package ArrayPracticeAssignment;

public class SwapStringArray {
    public static void main(String[] args) {
        String[] arr={"Banana","Apple","Grapes","Orange","Pineapple"};
        String  temp=arr[0];
        arr[0]=arr[2];
        arr[2]=temp;
        System.out.println(arr.length);
        for(String str:arr){
            System.out.println(str);
        }
    }
}
