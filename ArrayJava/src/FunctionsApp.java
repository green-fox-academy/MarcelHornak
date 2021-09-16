public class FunctionsApp {

    public static void main(String[] args) {

        String studentName = "Lenka";
        String studentSurname = "Michalovičova";

        sayHello("Marek", "Schery");
        sayHello(studentName, studentSurname);
        sayHello("Jirka", "Šmerda");

        int years = yearsUntilEndOfCentury(2021);
        System.out.println(yearsUntilEndOfCentury(2021));
    }

    public static void sayHello(String firstName, String surName) {
        int number = 5;
        System.out.println("Hello " + firstName + " " + surName);
    }

    public static int yearsUntilEndOfCentury(int currentYear) {

        int suffix = currentYear % 100;
        int remaining = 100 - suffix;

        return remaining;
    }

}