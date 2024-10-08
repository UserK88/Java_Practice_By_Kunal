package javapractice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fact = 1;
        for(int i = n; i>0; i--){
            fact = fact*i;

        }
        System.out.println(fact);
        scan.close();
    }
}
