

    
import java.util.Scanner;
public class triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int A , B , C ;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if( (A+B>C) && (A+C>B) && (B+C>A)){
            System.out.println("YES");
        }
        else {
             System.out.println("NO");
        }
    }
}
    

