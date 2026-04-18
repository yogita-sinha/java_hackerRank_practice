
    import java .util.Scanner;
    public class ChefCandyOvertime {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       
       
        if (y<=x){
            System.out.println(y);
        }
        else{
            int extra = y - x;
            int total = x + (extra*2);
            System.out.println(total);
        }
        
    }
}

 