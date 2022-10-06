package Taks2;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room>BuildingRooms;
   private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding,ArrayList<Room>BuildingRooms){
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.BuildingRooms = BuildingRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }


    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public ArrayList<Room> getBuildingRooms() {
        return BuildingRooms;
    }

    public int getNumberOfFloors(){
      return numberOfFloors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "BuildingRooms=" + BuildingRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfFloors=" + numberOfFloors +
                ", isOfficeBuilding=" + isOfficeBuilding +
                '}';
    }

}
