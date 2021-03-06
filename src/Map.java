public class Map {
    Description desc = new Description();

    Room r1 = new Room("Room 1", desc.getRandomDescription());
    Room r2 = new Room("Room 2", desc.getRandomDescription());
    Room r3 = new Room("Room 3", desc.getRandomDescription());
    Room r4 = new Room("Room 4", desc.getRandomDescription());
    Room r5 = new Room("Room 5", desc.getRandomDescription());
    Room r6 = new Room("Room 6", desc.getRandomDescription());
    Room r7 = new Room("Room 7", desc.getRandomDescription());
    Room r8 = new Room("Room 8", desc.getRandomDescription());
    Room r9 = new Room("Room 9", desc.getRandomDescription());

    Map(){
        //sætter current room til rum 1
        Player.setCurrentRoom(r1);

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

        r9.setNorth(r6);
        r9.setWest(r8);

    }
}
