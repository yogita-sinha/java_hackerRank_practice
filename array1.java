import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {
        // 5 students ke marks store krne hai

        int arr5[]={1,345,256,25,6235,232,345,345,1345,1345,1};
        int len=arr5.length;
        System.out.println("length of array is "+len);

        Scanner sc = new Scanner(System.in);

        // declaration
        // when size is not defined
        int arr[][];
        // when size is defined
        int arr1[][]= new int[4][7];
        // int arr1[][]= new int[rows][columns];

        // definition
        int arr2[][]={
            {6,9,14,7,10},
            {8,12,14,17,4},
            {5,9,18,27,62}
        };

        // System.out.println(arr2[1][1]);

        int arr3[][]=new int[2][4];

        // for(int row=0;row<=1;row++){
        //     for(int col=0;col<=3;col++){
        //         System.out.println("enter element for "+row+" th row and "+col+" th col");
        //         arr3[row][col]=sc.nextInt();
        //     }
        // }

        // for(int row=0;row<=1;row++){
        //     // System.out.println(arr3[row][0] +" "+arr3[row][1]+" "+arr3[row][2]+" "+);

        //     for(int col=0;col<=3;col++){
        //         System.out.print(arr3[row][col]+" ");
        //     }
        //     System.out.println();
        // }


        // print only row with index 1
        for(int col=0;col<=4;col++){
            System.out.print(arr2[1][col]+" ");
        }
        System.out.println();
        // print only column with index 1
        for(int row=0;row<=2;row++){
            System.out.println(arr2[row][1]);
        }

        int row=arr2.length;
        int col=arr2[2].length;

        System.out.println("rows "+row+" cols "+col);



        
    }
}

class student {
    // properties
    String name;

    // pass by value
    void func1(int a, int b) {
        System.out.println("2 parameters int");
        System.out.println(a + b);
    }

    // object bheja hai
    // pass by object
    void func2(student obj) {
        System.out.println("object ka name ");
        System.out.println(obj.name);
    }

}


