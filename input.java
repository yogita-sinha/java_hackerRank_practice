
import java .util.*;
public class input {
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc .nextInt();
      System.out.println("The number you entered is: " + n);

      for (int i=1; i<=n; i++){
        System.out.println(i*n);
      }

    }
    
}
