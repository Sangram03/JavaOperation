public class Print01 {
    public static void main(String[] args) {
        int arr[] = { 0,1,0,0,1};

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                System.out.print(arr[i]);
            }
            
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                System.out.print(arr[i]);
            }
        }
    }
}
