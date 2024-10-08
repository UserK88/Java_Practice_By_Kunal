package DSA;

public class binsearcxh {
    public static void main(String[] args) {
        int [] array = {4,5,10,15,20,25,30,35,40,45,50,58,65,80,98};

        int beg = 0;
        int end = array.length-1;
        int mid = (beg+array.length)/2;

        int element = 65;

        for(int i = beg; i<end; i++){
            if(array[i]==element){
                System.out.println("The element is at position "+(i+1));
                break;
            }
            beg = mid+1;
            mid = (beg+end)/2;
        }
    }
}
