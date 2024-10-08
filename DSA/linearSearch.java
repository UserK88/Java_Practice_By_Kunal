package DSA;

import java.util.Arrays;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();

        int [] array = new int[size];
        
        System.out.println("Enetr the "+size+" elements to your array: ");
        for(int i =0; i<size; i++){
            array[i]=scan.nextInt();
        }

        System.out.println("Enter the element to be searched in the array: ");
        int element = scan.nextInt();
        System.out.println("Element = "+element);

        System.out.println("Your entered array is "+Arrays.toString(array));

        int pos=-1;
        for(int j =0; j<array.length; j++){
            if(array[j]==element){
                pos = j+1;
                break;
            }
            
        }
      
        System.out.println("The position of the element in the array is "+pos);
        scan.close();

    }
}
