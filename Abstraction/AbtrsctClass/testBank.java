package Abstraction.AbtrsctClass;

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    public int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    public int getRateOfInterest(){
        return 8;
    }
}
public class testBank {
   public static void main(String[] args) {
    SBI obj = new SBI();
    System.out.println("The rate of interest of SBI is: "+obj.getRateOfInterest());
    PNB obj2 = new PNB();
    System.out.println("The rate of interest of PNB is: "+obj2.getRateOfInterest());
   }
}
