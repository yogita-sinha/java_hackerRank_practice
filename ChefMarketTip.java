import java.util.Scanner;
public class ChefMarketTip {

    

    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        
         int x , p1 , p2 , p3;
        x = sc.nextInt();
        p1 = sc.nextInt();
        p2 = sc.nextInt();
        p3 = sc.nextInt();
        
        int sum = p1 + p2 + p3;
        
        if( x >= sum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
    

