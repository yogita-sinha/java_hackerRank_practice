import java.util.*;

public class everestClimb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            // If he can reach in one day
            if (x >= n) {
                System.out.println(1);
            } else {
                long net = x - y;
                long remaining = n - x;

                long days = (remaining + net - 1) / net + 1; // ceil + last day
                System.out.println(days);
            }
        }
    }
}