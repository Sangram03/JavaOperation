public class NewsearchInArray {
    public static void main(String[] args) {
        int arr[] = {12, 13, 24,36 };
        int target = 12 ;
        SearchInArray(arr,target)
    }

        public static void SearchInArray(int arr[], int target){
             for(int i=0; i< arr.length; i++){
                if(arr[i] == target){
                    System.out.println(i);
                }
             }
        }
    }

