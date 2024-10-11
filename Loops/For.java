package Loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.println("Enter your good name: ");
        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        
        scan.close();
    }
}
