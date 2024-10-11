package App;
import java.util.*;

class Player_A {
    int p_scr = 0;
    int p_input;
    String name;

    Player_A(String name){
        this.name = name;
    }
}

class Computer{
    int c_scr;
    int c_guess;
    String name = "Bahubali";
    public int C_guess(){
        Random r = new Random();
        return r.nextInt(2);
    }
}

public class Application
{
    public static void main(String[] args) {

        Player_A player = new Player_A("Katappa");

        Computer computer = new Computer();

        Scanner sc = new Scanner(System.in);

        for(;;)
        {
            System.out.println("Enter your Input");
            player.p_input = sc.nextInt();
            System.out.println("You Entered: "+player.p_input);
            computer.c_guess = computer.C_guess();
            System.out.println("Computer guess: "+computer.c_guess);


            if(player.p_input == computer.c_guess)
            {
                computer.c_scr++;
            }
            else{
                player.p_scr++;
            }

            System.out.println("Computer Score: "+computer.c_scr);
            System.out.println("Player Score: "+player.p_scr);

            if(computer.c_scr == 4){
                System.out.println("Computer won!");
                break;
            }
            else if(player.p_scr == 4){
                System.out.println("Player win the game!");
                break;
    
            }
        }

        sc.close();
       
        
    }
}