
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {12 ,15 ,18 ,19, 21};


        int first =0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
