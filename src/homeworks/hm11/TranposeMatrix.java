package homeworks.hm11;

import java.util.Scanner;

public class TranposeMatrix {

    public static int inputAndCheckMatrixValue(int num) {
        System.out.println("Let`s create your own matrix! Set value for rows, in the next step for columns");
        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= 1 && num <= 9) {
                    break;
                } else {
                    System.out.println("Set data with 1-9 range only!");
                }
            } else {
                System.out.println("Set data with whole numbers only!");
            }
        } while (true);
        return num;
    }

    public static int[][] randomFillDataAndShowMatrix(int matrix[][], int randomMin, int randomMax) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int result = (int) ((randomMin) + ((randomMax - randomMin) * Math.random()));
                matrix[i][j] = result;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] transposeAndShowMatrix(int transpose[][], int matrix[][]) {
        for (int i = 0; i < transpose.length ; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }


    public static void main(String[] args) {

        int matrixRows = 0; //start value
        int matrixColumns = 0; // start value

        matrixRows = inputAndCheckMatrixValue(matrixRows); //rows input was created and verified
        matrixColumns = inputAndCheckMatrixValue(matrixColumns); // columns input was created and verified

        int matrix[][] = new int[matrixRows][matrixColumns]; // matrix is already created!

        System.out.println("Here is you created matrix!");
        matrix = randomFillDataAndShowMatrix(matrix, 1, 9); // our matrix was filled by random values,look!

        int transpose[][] = new int[matrixColumns][matrixRows]; // creating new prototype for a tpanspose operation!

        System.out.println("Here is your transposed matrix!");
        transposeAndShowMatrix(transpose, matrix); // We transposed our matrix, nice job!
    }
}