import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println("Sum: " + (num + num1 + num2 + num3 + num4));
        System.out.print("Average: " + ((num + num1 + num2 + num3 + num4) / 5));






    }
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
    }
