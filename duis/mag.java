import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            System.out.println("You entered: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
