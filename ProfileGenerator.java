import java.util.Scanner;

public class ProfileGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading inputs
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        boolean likesProgramming = sc.nextBoolean();

        // Printing the formatted sentence
        System.out.print("Hello, my name is " + firstName + " " + lastName + ". I am " + age + " years old, " + height + " meters tall, and it is " + likesProgramming + " that I like programming!");

        sc.close();
    }
}
