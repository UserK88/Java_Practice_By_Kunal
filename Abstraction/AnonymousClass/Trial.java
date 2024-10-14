package Abstraction.AnonymousClass;

abstract class Animal {
    abstract void sound();
}
abstract 
public class Trial {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            public void sound(){
                System.out.println("Dog is barking");
            }
        };
        dog.sound();
    }
}
