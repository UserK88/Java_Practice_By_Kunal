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
        System.out.println("Select the Unit for entering your weight, Enter 1 for entering your weight in Pounds(lbs) or Enter 2 for entering your weight in Kilograms(Kgs)");
        int unit = scan.nextInt();
        double weight =0;
        if(unit==1){
            System.out.println("Enter your weight in Pounds(lbs)");
            weight = scan.nextDouble();
            weight = 0.453592*weight;
        }
        else if(unit==2){
            System.out.println("Enter your weight in Kgs");
            weight = scan.nextDouble();
        }
        System.out.println("\nSelect the unit for entering your height,\nEnter 1 if you want to put your height in meters(m),\nEnter 2 if you want to put your height in centimeters(cm) or\nEnter 3 if you want to put your height in Feets(ft).");
        int input = scan.nextInt();
        double height = 0;;
        if(input==1){
            System.out.println("Enter your height in meters(m)");
            height = scan.nextDouble();
        }
        else if(input==2){
            System.out.println("Enter your height in centimeters(cm)");
            height = scan.nextDouble();
            height = height/1000;
        }
        else if(input==3){
            System.out.println("Enter your height in feets(ft)");
            height = scan.nextDouble();
            height = height*0.3048;
        }
        
        if(weight>0 && weight<150){
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