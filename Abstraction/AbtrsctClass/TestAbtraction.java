package Abstraction.AbtrsctClass;

abstract class Bike {
    int gear;

    Bike(){
        System.out.println("Bike is created");
    }

    // abstract void run();
    public void run(){
        System.out.println("Bike is runnig");
    }

    int changeGear(int gear){
        this.gear = gear;
        return gear;
    }
    void changeGear(){
        System.out.println("gear changed");
    }

}
class Honda extends Bike {
    public void run(){
        System.out.println("Honda is running");
    }
    public void stop(){
        System.out.println("Honda stopped");
    }
    void changeGear(){
        System.out.println("gear changed in Honda");
    }
}
public class TestAbtraction {
    public static void main(String[] args) {
        Bike B = new Honda();

        B.run();
        B.changeGear(4);
        B.changeGear();
        // B.changeGear();
        // B.stop();    //This will not work here, because this is dynamic method dispatch, the refence is of bike object
                        // so only the methods of bike object are accessible and the methods 

        Honda H = new Honda();
        System.out.println("Gear: "+H.changeGear(2));

        H.run();
        H.stop();
    }
}
