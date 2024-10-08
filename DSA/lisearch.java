package DSA;

import java.util.*;
public class lisearch {
    public static void main(String []args){
        int arr[]=new int[]{20,30,40,50,60,70,80,90};
        Scanner scan = new Scanner(System.in);
        System.out.println("Which number to find");
        int key =scan.nextInt();
        int size = arr.length;

        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("Found it. Its on index " + i);
                break;
            }
            if(i==size-1){
                System.out.println("Element not found");
            }
           

        }
        scan.close();

    }
}