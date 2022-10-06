package Taks2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room>rooms = new ArrayList<>();

    public static void main(String[] args) {
        Room room1 = new Room(3, 3, 3);
        Room room2 = new Room(4, 4, 4);
        Room room3 = new Room(5, 5, 5);


        ArrayList<Room>rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(4, 4, false, rooms);

        System.out.println(countLamps(building1));
        System.out.println(isRoomToFloorRatioGood(building1));



    }
    public static int countLamps(Building building){
        int numOfLamps = 0;
        for(int i = 0; i< building.getBuildingRooms().size();i++) {
            numOfLamps += building.getBuildingRooms().get(i).getNumberOfLamps();
        }
        return numOfLamps;
        }

    public static boolean isRoomToFloorRatioGood(Building building){
      if(building.getNumberOfFloors() > building.getBuildingRooms().size()){
         return  true;
      }
      return false;
    }

    }





