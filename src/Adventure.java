import java.util.Scanner;

public class Adventure {

    public static boolean gamesRunning = true;

    public static void main(String[] args) {

        Adventure a = new Adventure();
        Map map = new Map();
        Commands commands = new Commands();



        // Start rummet
        System.out.println("Du befinder dig i "+ Player.getCurrentRoom());

        System.out.println("For at færdes i grotten kan bruge commandoerne:\n");
        a.help();

        System.out.println("\nHVAD VIL DU?");




        do {
            commands.nextMovement();

        } while (gamesRunning);

    }




    public void help(){
        System.out.println("exit = for at afbryde spillet");
        System.out.println("look = for at få gentaget beskrivelsen af rummet");
        System.out.println("help for at få instruktion over commandoer");

    }

}
