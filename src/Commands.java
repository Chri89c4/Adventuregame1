import java.util.Scanner;

public class Commands {

    // All Commands
    final static private String GO_NORTH = "go north";
    final static private String GO_N = "n";
    final static private String GO_EAST = "go east";
    final static private String GO_E = "e";
    final static private String GO_SOUTH = "go south";
    final static private String GO_S = "s";
    final static private String GO_WEST = "go west";
    final static private String GO_W = "w";

    final static private String HELP = "help";
    final static private String DESCRIPTION = "description";
    final static private String EXIT = "exit";
    final static private String LOOK = "look";

    final static private String YES = "yes";
    final static private String NO = "no";

    final static private String[] COMMANDS_LIST = {GO_NORTH, GO_N, GO_EAST, GO_E, GO_SOUTH, GO_S, GO_WEST, GO_W, HELP, DESCRIPTION, EXIT, YES, NO, LOOK};

    public static String getAllInput() {
        Scanner scanner = new Scanner(System.in);
        int countError = 0;
        int amountMistakeBeforeMessage = 3;

        do {
            String input = scanner.nextLine();

            for (int i = 0; i < COMMANDS_LIST.length; i++) {
                if (input.equals(COMMANDS_LIST[i])) {
                    return input;
                }
            }

            if (countError > amountMistakeBeforeMessage) {
                System.out.println("Press help for list of Commands");
            }

            countError++;


        } while (true);
    }
    public static String getYesOrNo(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals(YES) || input.equals(NO)){
                return input;
            } else {
                System.out.println("Yes or No");

            }
        }
    }

    public String intro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cave Adventure Game!");
        System.out.println("____________________________________");

        System.out.println("What is your name explorer?");
        String playerName = scanner.nextLine();

        System.out.println("Great to have you in the game "+ playerName + "!");

        System.out.println("\nThis is the start of the cave and you are currently in  " + Player.getCurrentRoom());

        System.out.println("\nTo navigave throughout the cave, you can use the following commands:");
        System.out.println("go north \ngo east \ngo south \ngo west");
        System.out.println("_________________________________");
        System.out.println("Type help - In case of emergency.\n"
            + "Type look - To get the room description again.\n"
            + "Type exit - To rage quit and end the game.");

        System.out.println("\nIn which direction do you want to go?");

        return playerName;
    }
    public void help() {
        System.out.println("\nTo navigave throughout the cave, you can use the following commands:");
        System.out.println("go north \ngo east \ngo south \ngo west");
        System.out.println("_________________________________");
        System.out.println("Type help - For list of commands.\n"
            + "Type look - To get the room description again.\n"
            + "Type exit - To rage quit and end the game.\n");
    }

    public void nextMovement() {
        String userInput = Commands.getAllInput();

        if (userInput.equals("look")){
            System.out.println(Player.getCurrentRoom());
        }

        if (userInput.equals("go north") || userInput.equals("n")) {
            if (Player.getCurrentRoom().getNorth() != null) {
                Player.setCurrentRoom(Player.getCurrentRoom().getNorth());

                System.out.println(Player.getCurrentRoom());

            } else
                System.out.println("you bumbed in a wall \n" + "you are still in " + Player.getCurrentRoom());
        }

        if (userInput.equals("go east") || userInput.equals("e")) {
            if (Player.getCurrentRoom().getEast() != null) {
                Player.setCurrentRoom(Player.getCurrentRoom().getEast());

                System.out.println(Player.getCurrentRoom());
            } else
                System.out.println("you bumbed in a wall \n" + "you are still in " + Player.getCurrentRoom());
        }

        if (userInput.equals("go west") || userInput.equals("w")) {
            if (Player.getCurrentRoom().getWest() != null) {
                Player.setCurrentRoom(Player.getCurrentRoom().getWest());


                System.out.println(Player.getCurrentRoom());
            } else
                System.out.println("you bumbed in a wall \n" + "you are still in " + Player.getCurrentRoom());
        }

        if (userInput.equals("go south") || userInput.equals("s")) {
            if (Player.getCurrentRoom().getSouth() != null) {
                Player.setCurrentRoom(Player.getCurrentRoom().getSouth());

                System.out.println(Player.getCurrentRoom());
            } else
                System.out.println("you bumbed in a wall \n" + "you are still in " + Player.getCurrentRoom());

        }


        if (userInput.equals("exit")) {
            System.out.println("Are you sure");

            String answer = getYesOrNo();

            if (answer.equals("yes")) {
                System.out.println("The End...!");
                Adventure.gamesRunning = false;

            }
            if (answer.equals("no")) {
                System.out.println("Good");
                System.out.println("You can continue your game");
                Adventure.gamesRunning = true;
            }
        }

        if (userInput.equals("help")) {
            help();
        }



    }

}
