import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the double value
        double n = sc.nextDouble();
        
        // Explicitly casting double to int to truncate decimals
        int y = (int) n;
        
        // Printing the result
        System.out.println(y);
        
        sc.close();
    }
}


