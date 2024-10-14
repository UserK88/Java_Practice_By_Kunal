package Abstraction.Interface;
interface showable1 {
    void print();
    static int cube(int n){
        return n*n*n;
    }
    default void def(){
        System.out.println("default method");
    }
}
public class testInt implements showable1{
    public void print(){
        System.out.println("Print method");
    }
    public static void main(String[] args) {
        showable1 obj = new testInt();
       obj.print();
       obj.def();
       showable1.cube(5);
    }
}
