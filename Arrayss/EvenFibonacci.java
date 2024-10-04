package Arrayss;
public class EvenFibonacci {
    public static void main(String[] args) {
        long[] evenFibonacci = new long[20];
        
        long a = 0; 
        long b = 1; 
        int count = 0;


        // for(int i=0; i<60;i++){
        //     long next= a+b;
        //     a = b;
        //     b = next;
        //     if (a % 2 == 0 && a !=0){
        //         evenFibonacci[count] = a;
        //         count++;
        //     }
        // }

        while (count < 20) {
            long next = a + b; // Calculate next Fibonacci number
            a = b;             // Update 'a' to 'b'
            b = next;          // Update 'b' to 'next'
            
            if (a % 2 == 0 && a != 0) { // Check if the number is even and not zero
                evenFibonacci[count] = a; // Store even Fibonacci number
                count++;
            }
        }

        for (int i = 0; i < evenFibonacci.length; i++) {
            System.out.println("[a[" + i + "]=" + evenFibonacci[i] + "]");
        }
        long Sum = 0;
        for (int i=0; i< evenFibonacci.length; i++){
            Sum = Sum + evenFibonacci[i];
        }
       System.out.println(Sum);
    }
}