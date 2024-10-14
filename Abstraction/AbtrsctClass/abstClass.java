package Abstraction.AbtrsctClass;

abstract class Animal{
    String name;
    int weight;
    int age;

    void eat(){
        System.out.println("Eats food");
    }

    Animal(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
 // this is why constructors are useful(or are used) in abstract classes even if the objects of cannot be created
}

class Dog extends Animal {
    String color;
    void makeSound(){
        System.out.println("barking");
    }
    void drink(){
        System.out.println("Drinks milk or water");
    }
    Dog(String name, int weight, int age, String color){
        super(name, weight, age);
        this.color=color;
    }
}

public class abstClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 15, 5, "White");
        dog.makeSound();
        dog.eat();
        dog.drink();

    }
}
