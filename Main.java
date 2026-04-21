import java.util.*;
public class Main {
    public static void main(String[] args) {
        // String name = "Yogita";
        // System.out.println(name);

        Scanner sc = new Scanner (System.in);

        // System.out.println("enter string");
        // String str = sc.nextLine();
        // System.out.println(str);

        String a = "hello";
        System.out.println(a);

        String b = "world";
        System.out.println(b);

        if(a==b){
            System.out.println("both are same");
        }
        else{
            System.out.println("both are different");
        }


        if(a.equals(b)){
            System.out.println(" same");
        }
        else{
            System.out.println("different");
       }
    
        //obj ka nam.function ka naam 

        String obj1 = new String ("muskan");
        String obj2 = new String ("stuti");

        // obj2.display();
        obj1.equals("randomString");
        String pass = "1234";
        String name = "muskan";

        System.out.println("enter username ");
        String userName = sc.nextLine();

        System.out.println("enter password ");
        String userpass = sc.nextLine();

            if(name.equals(userName) && pass.equals(userpass)){
                System.out.println("Login successful!");
            }
            else{
                System.out.println("Login failed! Incorrect username or password.");
            }

        int arr[] = {1,2,3,4,5};
        int len = arr.length;
        int l = name.length();

        System.out.println("length of array is " + len);
        System.out.println("length of string is " + l);
        
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // access character at index

        a = "hello world";
        char ch = a.charAt(0);
        System.out.println("Character at index 0 is: " + ch);

        String m = "helo";
        String n = "world";
        String c = m+n;
        System.out.println(m);
        System.out.println(n);
        System.out.println(c);
        String d = m.concat(n);
        System.out.println(d);





    }
}