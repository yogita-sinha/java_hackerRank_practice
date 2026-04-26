public class pt3 {
    public static void main(String[] args) {
        //right angle triangle
        // *
        // **
        // ***
        // ****
        System.out.println("\nright angle triangle\n");
        int n =4;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");;
            }
            System.out.println();
        } 

        //inverted right angle triangle
        // ****
        // ***
        // **
        // *
        

        System.out.println("\ninverted right angle triangle\n");
        int m=4;
        for(int k = m; k>=1; k--){
            for(int l=1; l<=k; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
