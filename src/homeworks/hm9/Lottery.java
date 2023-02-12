package homeworks.hm9;


import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                System.out.print(arr[i] + ".");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arrLottery = new int[7];
        int[] arrPlayer = new int[7];
        int countWinningNumbers = 0;

        for (int i = 0; i < arrLottery.length; i++) {
            arrLottery[i] = (int) (Math.random() * 10);
        }


        Scanner scan = new Scanner(System.in);
        for (int j = 0; j < arrPlayer.length; j++) {
            System.out.println("Please, enter your lucky lottery number, just try scale 0-9");
            if (scan.hasNextInt()) {
                arrPlayer[j] = scan.nextInt();
                if (arrPlayer[j] < 0 || arrPlayer[j] > 9) {
                    System.out.println("Type 0-9 range only, try again");
                    j--;
                }
            } else if (scan.hasNextLine()) {
                arrPlayer[j] = Integer.parseInt(scan.nextLine());
                System.out.println("Type 0-9 range only, try again");
                j--;
            } else if(scan.hasNextDouble()) {
                arrPlayer[j] = (int) scan.nextDouble();
                System.out.println("Type 0-9 range only, try again");
                j--;
            }


        }

        bubbleSort(arrLottery);
        bubbleSort(arrPlayer);

        showArray(arrLottery);
        showArray(arrPlayer);


        for (int i = 0; i < arrLottery.length; i++) {
            if (arrLottery[i] == arrPlayer[i]) {
                countWinningNumbers++;
            }
        }
        System.out.println("Quantity of quessed numbers in lottery: " + countWinningNumbers);
    }
}

