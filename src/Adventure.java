import java.util.Scanner;

public class Adventure {

    public static boolean gamesRunning = true;

    public static void main(String[] args) {

        Commands commands = new Commands();
        Map map = new Map();
        Description desc = new Description();


        String playerName = commands.intro();

        Player player = new Player(playerName);

        do {
            commands.nextMovement();
        } while (gamesRunning);


    }
}





