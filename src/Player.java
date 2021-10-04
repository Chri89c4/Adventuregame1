public class Player {
    private String playerName;
    private static Room currentRoom;

    Player(String playerName){
        this.playerName = playerName;
    }



    public static Room getCurrentRoom() {
        return currentRoom;
    }
    public static void setCurrentRoom(Room currentRoom) {
        Player.currentRoom = currentRoom;
    }
}
