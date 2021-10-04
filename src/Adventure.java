import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        Adventure a = new Adventure();
        Map map = new Map();

        // Start rummet
        System.out.println("Du befinder dig i "+ Map.currentRoom );
        System.out.println("test test");

        System.out.println("For at færdes i grotten kan bruge commandoerne:\n");

        a.help();


        System.out.println("\nHVAD VIL DU?");

        do {
            String userInput = a.getInput();

            if (userInput.equals("go north")) {
                if (Map.currentRoom.getNorth() != null) {
                    Map.currentRoom = Map.currentRoom.getNorth();
                    System.out.println("Du er nu i rum " + Map.currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + Map.currentRoom);
            }

            if (userInput.equals("go east")) {
                if (Map.currentRoom.getEast() != null) {
                    Map.currentRoom = Map.currentRoom.getEast();
                    System.out.println("Du er nu i rum " + Map.currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + Map.currentRoom);
            }

            if (userInput.equals("go west")) {
                if (Map.currentRoom.getWest() != null) {
                    Map.currentRoom = Map.currentRoom.getWest();
                    System.out.println("Du er nu i rum " + Map.currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + Map.currentRoom);
            }

            if (userInput.equals("go south")) {
                if (Map.currentRoom.getSouth() != null) {
                    Map.currentRoom = Map.currentRoom.getSouth();
                    System.out.println("Du er nu i rum " + Map.currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + Map.currentRoom);

            }
        } while (true);
    }

    public String getInput() {
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
