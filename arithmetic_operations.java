
import java.util.*;
public class arithmetic_operations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //addition
        int sum = a+b;
        System.out.println(sum);

        //difference 
        int difference = b-a;
        System.out.println(difference);
    
        //pdt
        int pdt = a*b;
        System.out.println(pdt);

        //quotient
        int quotient = a/b;
        System.out.println(quotient);

         //modulus
         int modulus = a%b;
        System.out.println(modulus);    
       
    }
}
