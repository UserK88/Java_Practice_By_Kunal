package Loops;

import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args) {
        System.out.println("Enter the sales: ");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        double commissionRate;

        if(sales>10000){
            commissionRate = 0.3;
        }
        else if(sales>5001 && sales<9999){
            commissionRate = 0.2;
        }
        else if(sales>1001 && sales<4999){
            commissionRate = 0.1;
        }
        else{
            commissionRate = 0;
        }

        System.out.println("The commission for sales of "+sales+" is "+commissionRate*sales);
        scan.close();
    }
    
}
