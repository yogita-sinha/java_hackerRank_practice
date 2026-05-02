import java.util.*;

// Renamed class to match your filename "mainS"
class mainS {
    
    // Your logic from the Solution class
    public int sameChar(String A, String B) {
        int count = 0;
        A = A.toLowerCase();
        B = B.toLowerCase();
        
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    // Main function to execute the code
    public static void main(String[] args) {
        mainS obj = new mainS();
        
        // Example test cases
        String str1 = "choice";
        String str2 = "chancE";
        
        int result = obj.sameChar(str1, str2);
        
        System.out.println("String A: " + str1);
        System.out.println("String B: " + str2);
        System.out.println("Matching positions: " + result);
    }
}