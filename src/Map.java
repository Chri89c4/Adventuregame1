public class Map {

    Room r1 = new Room(null, "east", "south", null);
    Room r2 = new Room(null, "east", null,  "west");
    Room r3 = new Room(null, null, "south", "west");
    Room r4 = new Room("north", null, "south", null);
    Room r5 = new Room(null, null, "south", null);
    Room r6 = new Room("north", null, "south", null);
    Room r7 = new Room("north", "east", null, null);
    Room r8 = new Room("north", "easy", null, "west");
    Room r9 = new Room("north", null, null, "west");
}
