package Loops;

public class doWhile {
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int i = 0;

        int n3;

        do{
            System.out.println(n1);
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }while(i<20);
        
    }
    
}
