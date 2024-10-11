package LogicalOperators;

import java.util.Scanner;

public class ClassGrader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        int grade = scan.nextInt();

        if(grade>=0 && grade<=3){
            System.out.println("Failed");
        }
        else if(grade>3 && grade<=5){
            System.out.println("Insufficient");
        }
        else if(grade>5 && grade<=9){
            System.out.println("Good");
        }
        else if(grade==10){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Enter a valid number between 1 to 10");
        }
        scan.close();
    }
    
}
