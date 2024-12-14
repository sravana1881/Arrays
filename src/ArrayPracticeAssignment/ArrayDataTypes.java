package ArrayPracticeAssignment;

public class ArrayDataTypes {
    public static void main(String[] args) {
        Object[] arr=new Object[5];
        arr[0]=10;
        arr[1]="Hello Learners";
        arr[2]="Welcome to Java Programming ";
        arr[3]="World!";
        arr[4]=3.14;
        for(Object obj:arr){
            System.out.println(obj);
        }
    }
}
