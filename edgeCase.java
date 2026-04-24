import java.util.Scanner;
public class edgeCase {
    public static void main(String args[]){

    String a1 = new String("abc");
    String b1 = new String("abc");

    if(a1 == b1){
        //compare references
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }

    System.out.println();

    if(a1.equals(b1)){
        //compare values of those locations
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }

    System.out.println(); 

    }
    
}
