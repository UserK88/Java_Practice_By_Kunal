class Dog {
    String name;
    String breed;
    String color;

    void barking(){
        System.out.println("barking");
    }
    void fetching(){
        System.out.println("fetching");
    }
    void waggingTail(){
        System.out.println("Wagging Tail");
    }
}

class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
    public class Acl {
    public static void main(String [] args){

    }
}