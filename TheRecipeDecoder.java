import java .util.Scanner;
public class TheRecipeDecoder{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        String S = sc.nextLine();
        int countA = 0;
        int countB = 0;
        
        for(int i = 0; i< S.length(); i++){
            char ch = S.charAt(i);
            
            if(ch == 'A'){
                countA++;
            }
            else if (ch == 'B'){
                countB++;
            }
        }
        
        if(countA == countB){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
} 