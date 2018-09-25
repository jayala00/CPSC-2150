/*
    Jonathan Ayala, Clare DuVal
    CPSC 2151-002
    LAB 2
 */

package cpsc2150.lab2;

//User imports library
import java.util.Scanner;

public class MatrixApp {

    //MAIN
    public static void main(String [] args) {
        int row;
        int col;

        Scanner input = new Scanner(System.in);

        //Sets the dimensions of the matrix from user input
        System.out.println("Input the number of rows for your matrix.");
        row = input.nextInt();
        while (row > 10) {
            System.out.println("Exceeded max number of rows. Try again.");
            row = input.nextInt();
        }

        System.out.println("Input the number of columns for your matrix.");
        col = input.nextInt();
        while (col > 10) {
            System.out.println("Exceeded max number of columns. Try again.");
            col = input.nextInt();
        }

        int [][] Matrix = new int [row] [col];

        int rowcount;
        int colcount;

        // Fills the values of each coordinate of the matrix
        for (rowcount = 0; rowcount < row; rowcount++) {
            for (colcount = 0; colcount < col; colcount++) {
                System.out.println("What value would you like in Row " + rowcount + " Column " + colcount);
                Matrix[rowcount][colcount] = input.nextInt();
            }
        }

        // Prints out the matrix that's passed in
        System.out.println("Your matrix is:");
        String mat = printM(Matrix, row, col);
        System.out.print(mat);

        // 1 Returns a transposed matrix
        int[][] transMatrix = transpose(Matrix, row, col);
        System.out.println("Your transposed matrix is:");
        String trans = printM(transMatrix, col, row);
        System.out.print(trans);

        // 2 Returns an int of the product of the sums of each row
        int prodSums;
        prodSums = productofSums(Matrix, row, col);
        System.out.println("The product of sum is:");
        System.out.println(prodSums);

        // 3 Returns the average value in the matrix
        double avgMat;
        avgMat = avgMatrix(Matrix, row, col);
        System.out.println("The average is:");
        System.out.println(avgMat);

        // 4 Sums of each column
        int[][] colMatrix = sumOfCol(Matrix, row, col);
        System.out.println("The sums of each columns are:");
        String ColSums = printM(colMatrix, col, 1);
        System.out.print(ColSums);

        // 5 Sums of each row
        int[][] rowMatrix = sumOfRows(Matrix, row, col);
        System.out.println("The sums of each rows are:");
        String RowSum = printM(rowMatrix, row, 1);
        System.out.print(RowSum);

        //END MAIN

    }

    //FUNCTION DECLARATIONS
    // Prints out the passed in matrix
    private static String printM(int [][] someMatrix, int funcRow, int funcCol) {
        String word = "";

        for (int i = 0; i < funcRow; i++) {
            word = word + "|";

            for (int j = 0; j < funcCol; j++) {
                word = word + someMatrix[i][j];
                word = word + "|";
            }

            word = word + "\n";
        }

        return word;
    }

    // 1 Returns a transposed matrix from a passed in matrix
    private static int [][] transpose(int [][] someMatrix, int funcRow, int funcCol) {
        int[][] newMatrix = new int [funcCol][funcRow];

        for (int i = 0; i < funcRow; i++) {
            for (int j = 0; j < funcCol; j++) {
                newMatrix[j][i] = someMatrix[i][j];
            }
        }

        return newMatrix;
    }

    // 2 Returns an int of the product of the sums of each row of a passed in matrix
    private static int productofSums(int [][] someMatrix, int funcRow, int funcCol) {
        int pos = 1;
        int sumrow = 0;

        for (int i = 0; i < funcRow; i++) {
            for (int j = 0; j < funcCol; j++) {
                sumrow = sumrow + someMatrix[i][j];
            }
            pos = pos * sumrow;
            sumrow = 0;

        }

        return pos;
    }

    // 3 Returns the average value in the passed in matrix
    private static double avgMatrix(int [][] someMatrix, int funcRow, int funcCol) {
        double avg;
        double totNum = funcRow * funcCol;
        double avgsum = 0;

        for (int i = 0; i < funcRow; i++) {
            for (int j = 0; j < funcCol; j++) {
                avgsum = avgsum + someMatrix[i][j];
            }
        }

        avg = avgsum / totNum;

        return avg;
    }

    // 4 Sums of each column of the passed in matrix
    private static int [][] sumOfCol(int[][] someMatrix, int funcRow, int funcCol) {
        int [][] sumColA = new int[funcCol][1];

        for (int i = 0; i < funcRow; i++) {
            for (int j = 0; j < funcCol; j++) {
                sumColA[j][0] = sumColA[j][0] + someMatrix[i][j];
            }
        }

        return sumColA;
    }

    // 5 Sums of each row of the passed in matrix
    private static int [][] sumOfRows(int[][] someMatrix, int funcRow, int funcCol) {
        int [][] sumRowsA = new int [funcRow][1];

        for (int i = 0; i < funcRow; i++) {
            for (int j = 0; j < funcCol; j++) {
                sumRowsA[i][0] = sumRowsA[i][0] + someMatrix[i][j];
            }
        }

        return sumRowsA;
    }
}

//END