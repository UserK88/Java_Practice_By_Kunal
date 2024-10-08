package javapractice;

public class fibbonacci {
    public static void main(String [] args){
        long n1=0, n2=1;

        int count = 10;
        fibbo(n1,n2,count);

    }

    public static void fibbo(long n1, long n2, int count){
        long [] fibarr = new long[count];
        for(int i = 0; i<count; i++){
            long n3 = n1 + n2;
            fibarr[i]=n3;
            n1 = n2;
            n2 = n3;
        }
        fibarr[0]=0;
        fibarr[1]=1;
        for(int i =0; i< fibarr.length; i++){
            System.out.println("A["+i+"]="+fibarr[i]);
        }
    }
}
