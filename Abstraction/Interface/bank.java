package Abstraction.Interface;
interface BankInterface {
    float getRateOfInterest();
}
class SBI implements BankInterface {
    public float getRateOfInterest(){
        return 7.5f;
    }
}
class PNB implements BankInterface {
    public float getRateOfInterest(){
        return 9.0f;
    }
}
public class bank {
    public static void main(String[] args) {
        BankInterface sbi = new SBI();
        System.out.println("The rate of interest of SBI: "+sbi.getRateOfInterest());
    }
}
