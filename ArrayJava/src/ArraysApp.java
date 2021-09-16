import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] myArray = {5, 14, 12, 4, -2, 7, 34};

        System.out.println(myArray[2]);

        System.out.println(myArray.length);

        // změna hodnoty na indexu 2

        myArray[2] = 22;

        // sort - řazení pole

        Arrays.sort(myArray);

        // nefunkční System.out.println(myArray);

        // print celého Array
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            System.out.print(" ");
        }

        System.out.println();

        // pole polí - zápis

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        // jak dostanu hodnoty  z matrixu, např. 6

        System.out.println(matrix[1][2]); // [řádek][sloupec]

        // přepis hodnoty, 8 -> 11

        matrix[2][1] = 11;
        System.out.println(matrix[2][1]);

        // nefunkční print -> System.out.println(matrix[2]);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
        }
    }
}