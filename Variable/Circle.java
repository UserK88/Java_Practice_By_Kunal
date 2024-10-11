package Variable;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the diameter of the Circle: ");
        int diameter= scan.nextInt();
        double radius = (double) diameter/2;
        double area = (double) Math.PI*radius*radius;
        double perimeter = (double) 2*Math.PI*radius;

        System.out.println("The area of the circle is: "+area);
        System.out.println("The perimeter of the circle is: "+perimeter);

        scan.close();
    }
}
