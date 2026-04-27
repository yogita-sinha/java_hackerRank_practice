import java.util.Scanner;
public class EndlessReceipts {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        long sum=0;
        
       while(sc.hasNextLong()){
        long num = sc.nextLong();
           sum = sum+num;
        }
        
        System.out.println(sum);
    }
}
    

