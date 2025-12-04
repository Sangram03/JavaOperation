
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 12 ,25 ,37 ,39,49};


        Arrays.sort(arr);

        System.out.println("largest Number is "+arr[arr.length-1]);
        System.out.println("The SEcond Largest is "+arr[arr.length-2]);
    }
}
