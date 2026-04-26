public class pt4 {
    public static void main(String args[]) {

       //left angle triangle
       //     *
       //    **
       //   ***
       //  ****

       int n=4;
       for(int i=1; i<=n; i++){
        for(int sp=1; sp<=n-i; sp++){
            System.out.print(" ");
        }
        for(int st = 1; st<=i; st++){
            System.out.print("*");
         }
         System.out.println();
        }
       }
      
    }

