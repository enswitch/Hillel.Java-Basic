package homeworks.hm2;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        String letitudeCoordinate;
        String longitudeCoordinate;

        System.out.println("Tell me your coordinates?");
        Scanner asklatitude = new Scanner(System.in);
        Scanner asklongitude = new Scanner(System.in);

        letitudeCoordinate = asklatitude.nextLine();
        longitudeCoordinate = asklongitude.nextLine();

        System.out.println("Your current location is: " + letitudeCoordinate + ", " + longitudeCoordinate);

    }
}
