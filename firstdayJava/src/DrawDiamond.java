import java.util.Scanner;

 import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big should the Diamond be? ");
        int length = scanner.nextInt();
        for (int x = 1; x <= length; x++) {
            System.out.println(" ".repeat(length - x) + "*".repeat(x - 1) + "*" + "*".repeat(x - 1));
        }
    }
}

