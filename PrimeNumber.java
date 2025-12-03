
import java.util.Scanner;

// 2,3,5,7,11
// 1 
// itself
// 1 , 2
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = Sc.nextInt();

        if ( a==1) {
            System.out.println();
        }

        else if( a==2 || a==3){
            System.out.println();
        }

    
        for( int i = 2 ;i <= a-1; i++){
                if(a%i ==0){
                    System.out.println("Not a Prime");
                    break;
                }
                else{
                    System.out.println("Prime number");
                    break;
                }
            }
        }
    }

