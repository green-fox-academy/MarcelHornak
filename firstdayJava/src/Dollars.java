import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {

        System.out.println("Povedz kolko");

        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        System.out.println(("Remaining CENTY is: ") + remainingAmount);
        System.out.println(("Remaining Dollars is " + dollars));

    }
}
