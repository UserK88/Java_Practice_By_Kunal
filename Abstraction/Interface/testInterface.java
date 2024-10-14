package Abstraction.Interface;

interface printable2{
    void print();
}
interface showable2{
    void print();
}
public class testInterface implements printable2, showable2 {
    public void print(){
        System.out.println("print() method");
    }
    public static void main(String[] args) {
        testInterface obj = new testInterface();
        obj.print();
        System.out.println("This code shows that multiple inheritance in java is possible using Interfaces");
    }
}
