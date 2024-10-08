package javapractice;
import java.util.*;
public class prime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked");

        int n = sc.nextInt();

        boolean check = checkprime(n);

        if(check){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
    public static boolean checkprime(int n){
        if(n==0||n==1){
            System.out.println("Number is not prime");
            return false;
        }
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return  false;
//                System.out.println("Number is not prime number");
            }
//            else{
//                System.out.println("Number is a prime number");
//            }

        }
        return true;
    }
}
