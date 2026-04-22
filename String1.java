import java.util.*;
public class String1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        //string pool - 

        // a = "abcde";
        // b = "abcde";


        // string - immutable
        //string buffer, string builder - mutable
        
        //imutable
        String a = new String ( "hello");
        System.out.println("orignal string a:" +a);
        
        String d = a.concat("world!");
        System.out.println(d);
        //mutable
        StringBuilder b = new StringBuilder ("hello1");


        StringBuffer c = new StringBuffer ("hello2");
        
        System.out.println("orignal b :"+b);
        b.append("world1!");
        
        System.out.println("orignal(mutate) b :"+b);

        System.out.println();
        System.out.println();

        System.out.println("orignal c :"+c);
        c.append("world2!");
        System.out.println("orignal(mutate) c :"+c);
        
        //insert
        
        b.insert(3,"y");
        System.out.println("orignal(mutate) b :"+b);
        c.insert(3,"p");
        System.out.println("orignal(mutate) c :"+c);
        
        
    }
    
}
