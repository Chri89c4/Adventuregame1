public class Player {

    private static Room currentRoom;

    public static Room getCurrentRoom() {
        return currentRoom;
    }
    public static void setCurrentRoom(Room currentRoom) {
        Player.currentRoom = currentRoom;
    }
}
