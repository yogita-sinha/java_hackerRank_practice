import java.util.Scanner;
public class ChefAndTheGrades{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int A,B,C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int score = A + B + C;
        int average = (score)/3 ; 
        if (((A >=35)&&(B>=35)&&(C >=35) )&& (average >=50)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
     }
}
