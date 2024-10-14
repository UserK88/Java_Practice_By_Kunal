package Abstraction.AbtrsctClass;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle extends Shape {
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

public class testAbstrcation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}
