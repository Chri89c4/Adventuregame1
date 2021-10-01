import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {

        Adventure a = new Adventure();

        Room r1 = new Room("Rum1", "Dette er rum 1");
        Room r2 = new Room("Rum2", "Dette er rum 2");
        Room r3 = new Room("Rum3", "Dette er rum 3");
        Room r4 = new Room("Rum4", "Dette er rum 4");
        Room r5 = new Room("Rum5", "Dette er rum 5");
        Room r6 = new Room("Rum6", "Dette er rum 6");
        Room r7 = new Room("Rum7", "Dette er rum 7");
        Room r8 = new Room("Rum8", "Dette er rum 8");
        Room r9 = new Room("Rum9", "Dette er rum 9");

        r1.setSouth(r4);
        r1.setEast(r2);

        r2.setWest(r1);
        r2.setEast(r3);

        r3.setWest(r2);
        r3.setSouth(r6);

        r4.setNorth(r1);
        r4.setSouth(r7);

        r5.setSouth(r8);

        r6.setNorth(r3);
        r6.setSouth(r9);

        r7.setNorth(r4);
        r7.setEast(r8);

        r8.setNorth(r5);
        r8.setWest(r7);
        r8.setEast(r9);

        r9.setSouth(r6);
        r9.setWest(r8);

        // Start rummet
        Room currentRoom = r1;

        System.out.println("Du befinder dig i "+ currentRoom );

        System.out.println("For at færdes i grotten kan bruge commandoerne:\n");
        a.help();


        System.out.println("\nHVAD VIL DU?");

        while (true) {
            String userInput = a.getInput();

            if (userInput.equals("go north")) {
                if (currentRoom.getNorth() != null) {
                    currentRoom = currentRoom.getNorth();
                    System.out.println("Du er nu i rum " + currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + currentRoom);
            }

            if (userInput.equals("go east")) {
                if (currentRoom.getEast() != null) {
                    currentRoom = currentRoom.getEast();
                    System.out.println("Du er nu i rum " + currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + currentRoom);
            }

            if (userInput.equals("go west")) {
                if (currentRoom.getWest() != null) {
                    currentRoom = currentRoom.getWest();
                    System.out.println("Du er nu i rum " + currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + currentRoom);
            }

            if (userInput.equals("go south")) {
                if (currentRoom.getSouth() != null) {
                    currentRoom = currentRoom.getSouth();
                    System.out.println("Du er nu i rum " + currentRoom);
                } else
                    System.out.println("you bumbed in a wall \n" + "you are still in " + currentRoom);

            }
        }
    }

    public void map(){


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
