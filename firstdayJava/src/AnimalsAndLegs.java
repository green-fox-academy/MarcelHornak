import java.util.Scanner;
public class AnimalsAndLegs {

    public static void main(String[] args) {

        System.out.println("Give me two numbers");

        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        System.out.println((num *2) + (num1 * 4));
    }
}
