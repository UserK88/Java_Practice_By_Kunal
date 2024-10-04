package Arrayss;

public class FirstProgramme{
    public static void main(String[] args){
        int[] arr = new int[20];
        int n1= 0, n2 =1, n3;
    
        for (int i =0; i< arr.length; i++)
        {

            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            if(n3 % 2 ==0){
                arr[i] = n3;
            }
            

        
        }
       for (int i =0; i< arr.length; i++){
            System.out.println("A[" +i+"]=="+arr[i]);
       }
    }
}