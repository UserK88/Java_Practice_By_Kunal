package Loops;

import java.util.Scanner;

public class MovieTickets {
    
    public static double checkDiscount(int age){
        try (Scanner scan = new Scanner(System.in)) {
            if(age<5){
                return 7-(0.6*7);
            }
            else if(age>60){
                return 7-(0.55*7);

            }
            else{
                System.out.println("How many tickets do you want to buy? Enter the number: ");
                int count = scan.nextInt();
                if(count>1){
                    return 7*count-(0.3*(7*count));
                }
            }
        }
        return 7;
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        System.out.println("Your Ticket Price "+MovieTickets.checkDiscount(age)+" Euros");

        scan.close();
    }
}
