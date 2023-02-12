package homeworks.hm6;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int minNumber = 1;
        int maxNumber = 10;

        int randomNumber = (int) (minNumber + (maxNumber - minNumber) * (Math.random()));
        int triesCounter = 3;

        while (triesCounter >= 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type here to guess the right number from 1 to 10, you have " + triesCounter + " tries left");
            int answer = scan.nextInt();
            if (answer == randomNumber) {
                System.out.println("You guess the right number, my congratulations");
                break;
            } else {
                System.out.println("You are wrong!");
            }
            triesCounter--;
        }
        System.out.println("The computer guessed number: " + randomNumber);

    }


}
