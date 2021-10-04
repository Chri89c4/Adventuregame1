import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        Adventure a = new Adventure();
        Map map = new Map();


        // Start rummet
        System.out.println("Du befinder dig i "+ Map.currentRoom );

        System.out.println("For at færdes i grotten kan bruge commandoerne:\n");
        a.help();

        System.out.println("\nHVAD VIL DU?");

        Commands commands = new Commands();


    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void checkInput(String getInput) {
    }

    public void help(){
        System.out.println("exit = for at afbryde spillet");
        System.out.println("look = for at få gentaget beskrivelsen af rummet");
        System.out.println("help for at få instruktion over commandoer");

    }

}
