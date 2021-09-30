public class Map {
    private String currentRoom;


    Map(){
        Room r1 = new Room("Rum1",null, "east", "south", null);
        Room r2 = new Room("Rum2",null, "east", null,  "west");
        Room r3 = new Room("Rum3",null, null, "south", "west");
        Room r4 = new Room("Rum4","north", null, "south", null);
        Room r5 = new Room("Rum5",null, null, "south", null);
        Room r6 = new Room("Rum6","north", null, "south", null);
        Room r7 = new Room("Rum7","north", "east", null, null);
        Room r8 = new Room("Rum8","north", "east", null, "west");
        Room r9 = new Room("Rum9","north", null, null, "west");
    }

}
