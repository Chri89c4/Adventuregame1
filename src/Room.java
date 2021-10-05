public class Room {
    private String name;
    private String description;

    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public static int amountRoom = 0;

    // Constructor
    Room(String name, String description){
        this.name = name;
        this.description = description;
        amountRoom ++;
    }

    public Room getNorth() {
        return north;
    }
    public Room getEast() {
        return east;
    }
    public Room getWest() {
        return west;
    }
    public Room getSouth(){
        return south;
    }

    public void setNorth(Room north) {
        this.north = north;
    }
    public void setWest(Room west) {
        this.west = west;
    }
    public void setSouth(Room south) {
        this.south = south;
    }
    public void setEast(Room east) {
        this.east = east;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return name + " " + description;
    }


}
