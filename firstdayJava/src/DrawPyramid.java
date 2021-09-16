import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big should the pyramid be? ");
        int length = scanner.nextInt();
        for (int x = 1; x <= length; x++) {
            System.out.println(" ".repeat(length - x) + "*".repeat(x - 1) + "*" + "*".repeat(x - 1));
        }
    }
}