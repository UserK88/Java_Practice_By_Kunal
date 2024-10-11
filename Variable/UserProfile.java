package Variable;

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);
        System.out.println("Enter your job Experience");
        int exp = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your nationality");
        String nationality = scan.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Job Exp "+exp);
        System.out.println("Nationality: "+nationality);
        System.out.println("The year is: "+(2024-age));
        
        scan.close();
    }
}
