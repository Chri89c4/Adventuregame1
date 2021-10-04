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
}