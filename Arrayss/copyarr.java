package Arrayss;

public class copyarr {
    public static void main(String [] args){
    int [] array1 = {1,2,3,4,5};
    int [] array2 = new int[array1.length];
    
    for(int i =0; i<array1.length; i++){
        array2[i] = array1[i];
    }

    System.out.println("Elements of the original array:");
    for(int j =0;j<array1.length; j++){
        System.out.print(array1[j]+" ");
    }

    System.out.println("\nElements of new array:");
    for(int m : array2){
        System.out.print(m+" ");
    }

    }
}
