import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output
        Scanner Scanner = new Scanner(System.in);
        System.out.println("How long should array be?");

        Scanner sc = new Scanner(System.in);
        int Array = sc.nextInt();

        int[][] matrix = new int[Array][Array];

        for (int x = 0; x < matrix.length; x++) {
            System.out.println();
            matrix[x][x] = 1;


            for (int y = 0; y < matrix.length; y++) {
                System.out.print(matrix[x][y]);

            }


        }
    }
}

