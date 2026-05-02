import java.util.Scanner;

class substring {
    // Your core logic function
    String substring(String S, int L, int R) {
        StringBuilder s = new StringBuilder();
        
        // Loop from index L to R (inclusive)
        for (int i = L; i <= R; i++) {
            char ch = S.charAt(i);
            s.append(ch);
        }
        
        return s.toString();
    }

    public static void main(String[] args) {
        // Create scanner for user input
        Scanner sc = new Scanner(System.in);
        substring obj = new substring();

        System.out.print("Enter string S: ");
        String S = sc.next();

        System.out.print("Enter L (start index): ");
        int L = sc.nextInt();

        System.out.print("Enter R (end index): ");
        int R = sc.nextInt();

        // Call the function and print the result
        String result = obj.substring(S, L, R);
        System.out.println("Output: " + result);
        
        sc.close();
    }
}