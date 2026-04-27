import java.util.Scanner;
public class ChefAndUnluckyFour {

    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-->0){
            
            String n = sc.next();
            
            String result = n.replace("4" , "");
            
            if(result.isEmpty()){
                System.out.println(0);
            } else {
                
                System.out.println(Long.parseLong(result));
            }
            
            
            
            
        }
    }
}
    

