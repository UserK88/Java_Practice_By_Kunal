package App;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi I am A Program,\n We are playing a game,\n I will be generating the number between 0 and 1 randomly,\n and You will have to guess the number,\n If you guessed the number you will earn a point, if you could't I will earn a point.\n And whoever reach to the 5 points first, will win.\n Okay, So Let's start the game!");

        Random r = new Random();
        int p_scr=0;
        int c_scr=0;

        for(int i =0; i<10; i++){
            int x = r.nextInt(2);

            System.out.println("Enter your number");
            int inp = scan.nextInt();
            
            System.out.println("Your Entered number: "+inp);
            System.out.println("My generated number: "+x);

            if(inp==x){
                p_scr++;
                System.out.println("You earned a point!\n");
            }
            else{
                c_scr++;
                System.out.println("I got a point!\n");
            }

            if(p_scr==5 || c_scr==5){
                break;
            }
            
        }

        if(p_scr>c_scr){
            System.out.println("Congratulations, you won the game!");
        }else{
            System.out.println("HaHa, I won!");
        }
        scan.close();
    }
}
