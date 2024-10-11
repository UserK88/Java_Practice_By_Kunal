package LogicalOperators;

import java.util.Scanner;

public class BMICalc {

    public static void calculateBMI(double BMI){
        System.out.println("BMI: "+BMI);
        if(BMI < 18){
            System.out.println("Underwight");
        }else if(BMI>=18 && BMI<23){
            System.out.println("Normal weight");
        }else if(BMI>=23 && BMI<29.9){
            System.out.println("Overweight");
        }
        else if(BMI>=30){
            System.out.println("Obese");
        }
        else{
            System.out.println("Enter valid inputs");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in KGs between 0 and 150");
        double weight = scan.nextDouble();
        if(weight>0 && weight<150){
            System.out.println("Enter your height in meters between 0 and 2.7");
            double height = scan.nextDouble();
            if(height>0 && height<2.7){

                double BMI = weight/(height*height);

                BMICalc.calculateBMI(BMI);

                scan.close();
            }
            else{
                System.out.println("Enter valid inputs");
            }
        }
        else{
            System.out.println("Enter valid inputs");
        }
    }
}
// Underweight: BMI less than 18
// Normal weight: BMI between 18 and 23
// Overweight: BMI between 23 and 29.9
// Obesity: BMI of 30 or higher