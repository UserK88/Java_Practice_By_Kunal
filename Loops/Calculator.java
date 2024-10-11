package Loops;

import java.util.Scanner;

public class Calculator {
    private static void addition(int a, int b){
        System.out.println("Addition is: "+(a+b));
    }
    private static void substraction(int a, int b){
        System.out.println("Substraction is: "+(a-b));
    
    }private static void multiplication(int a, int b){
        System.out.println("Multiplication is: "+a*b);
    
    }private static void division(int a, int b){
        System.out.println("Division is "+a/b);
    }
    private static void sqrt(int a){
        System.out.println("Square root of "+a+" is"+Math.sqrt(a));
    }
    private static void powOf(int a, int b){
        System.out.println(b+" power of "+a+" is: "+Math.pow(a, b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        addition(n1,n2);
        substraction(n1, n2);
        multiplication(n1, n2);
        division(n1, n2);
        sqrt(n2);
        powOf(n1, n2);
        
        scan.close();
    }
    
}
