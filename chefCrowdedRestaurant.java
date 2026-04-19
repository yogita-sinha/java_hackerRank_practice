import java . util . Scanner ; 
public class chefCrowdedRestaurant{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        
        int N ,K ;
        N = sc.nextInt();
        K = sc.nextInt();
        
        int current_people=0;
        int count =0;
        
        for (int i = 0; i < N ; i++){
            int event = sc.nextInt();
            
                current_people += event;
            
            if(current_people > K){
                count ++;
            }
        }
        System.out.println(count);
        
    }
}