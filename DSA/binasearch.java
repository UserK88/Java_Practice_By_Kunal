package DSA;

public class binasearch {
    public static void binarysearch(int [] array, int begin, int end, int key){
        int mid = (begin+end)/2;
        while(begin<=end){
            if(array[mid]==key){
                System.out.println(key+" is found at position "+(mid+1));
                break;
            }
            else if(array[mid]<key){
                begin=mid+1;
            }
            else{
                end = mid -1;
            }
            if(begin>end){
                System.out.println("The element is not found");
            }
            mid = (begin+end)/2;
        }
    }
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int begin = 0;
        int end = array.length-1;
        int key = 50;

        binarysearch(array, begin, end, key);
    }
}
