package Abstraction.Interface;

interface showable3{
    void show();
}
interface printable3{
    void print();
}
public class A7class implements showable3, printable3 {
    public void show(){
        System.out.println("showable method");
    }
    public void print(){
        System.out.println("printable method");
    }
    public static void main(String[] args) {
        A7class obj = new A7class();
        obj.show();
        obj.print();
    }
}
