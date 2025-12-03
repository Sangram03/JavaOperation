
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 23 , 24, 56 ,87 ,65};
        int target = 23;

        searchInArray(arr, target);


        public static void searchInArray(int arr[], int target){
              for ( int i=0 ; i< arr.length-1;i++){
                if (arr[i] == target)
                    System.out.println(i);
              }
        }

    }
}
