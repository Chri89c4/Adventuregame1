import java.util.Scanner;

public class Commands {

    // All Commands
    final static private String GO_NORTH = "go north";
    final static private String GO_EAST = "go east";
    final static private String GO_SOUTH = "go south";
    final static private String GO_WEST = "go west";

    final static private String HELP = "help";
    final static private String DESCRIPTION = "description";
    final static private String EXIT = "exit";

    final static private String YES = "yes";
    final static private String NO = "no";

    final static private String[] COMMANDS_LIST = {GO_NORTH, GO_EAST, GO_SOUTH, GO_WEST, HELP, DESCRIPTION, EXIT, YES, NO};

    public static String getAllInput(){
        Scanner scanner = new Scanner(System.in);
        int countError = 0;
        int amountMistakeBeforeMessage = 3;

        do {
            String input = scanner.nextLine();

            for (int i = 0; i < COMMANDS_LIST.length ; i ++ ){
                if (input.equals(COMMANDS_LIST[i]) ){
                    return input;
                }
            }

            if (countError > amountMistakeBeforeMessage){
                System.out.println("Press help for list of Commands");
            }

            countError++;


        } while (true);
    }
    Commands(){
        boolean gamesRunning= true;
        do {
            String userInput = Adventure.getInput();

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
            if (userInput.equals("exit")) {
                System.out.println("Are you sure");
                //gamesRunning = false;
                if (userInput.equals("yes")) {
                    System.out.println("The End...!");
                    gamesRunning = false;

                }
                if (userInput.equals("no")) {
                    System.out.println("Good");
                    System.out.println("You can continue your game");
                    gamesRunning = true;
                }
            }

        } while (gamesRunning);
    }
}
