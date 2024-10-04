package Arrayss;

public class freqarray {
    public static void main(String[] args) {
        int [] intarr = {1,2,8,3,2,2,2,5,1};

        int [] freq = new int[intarr.length];

        int visited = -1;
        
        for(int i =0; i<intarr.length; i++){
            int count = 1;
            for(int j = i+1; j<intarr.length; j++){
                
                if(intarr[i]==intarr[j]){
                    count++;
                    freq[j]=visited;
                }

            }
            if(freq[i]!=visited){
                freq[i]=count;
            }
        }
        
        for(int m : freq){
            System.out.print(m+" ");
        }
    }
}
