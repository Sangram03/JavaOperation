// 1234 = 1+2+3+4 = 10

class SumofDigits{
    
    public static void main(String[] args) {
        int a = 1234;
        
        int sum =0;


        while(a>0){
            int digit = a % 10;
            sum = sum+ digit;
            a= a/10;
        }

        System.out.println(sum);

    }
}