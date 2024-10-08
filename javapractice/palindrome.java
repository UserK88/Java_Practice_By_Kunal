package javapractice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check palindrome");
        int numcheck = sc.nextInt();

        int temp = numcheck;
        int digit=0;
        int rm;

        while(numcheck>0){
            rm=numcheck%10;
            digit=digit*10+rm;

            numcheck/=10;
        }
        if(temp==digit){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
