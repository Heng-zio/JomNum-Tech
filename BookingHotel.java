import java.util.Scanner;
public class BookingHotel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //Array 2D
        int[][] hotel = {
            {101,102,103,104},
            {201,202,203,204},
            {301,302,303,304},
            {401,402,403,404},
            {501,502,503,504}
        };

        boolean found = false;
        int floorLabel = 0;
        
        System.out.print("Enter room number to check in : ");
        int roomNumber = input.nextInt();

        for (int floor = 0; floor < hotel.length; floor++) {
            for (int room = 0; room < hotel[floor].length; room++) {
                if (hotel[floor][room] == roomNumber) {
                    found = true;
                    floorLabel = floor;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Found room : " + roomNumber + " at floor " + (floorLabel + 1));
        }else {
            System.out.println("Room not found : " + roomNumber);
        }

        input.close();
    }
}