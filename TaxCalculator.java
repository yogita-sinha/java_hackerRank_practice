import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax;

        // Apply tax rules based on brackets
        if (income <= 10000) {
            tax = income * 0.05;
        } else if (income <= 50000) {
            tax = income * 0.10;
        } else {
            tax = income * 0.20;
        }

        // Truncate the decimal by casting to int
        int finalTax = (int) tax;
        
        System.out.println(finalTax);

        sc.close();
    }
}

