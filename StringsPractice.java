import java.util.*;

public class StringsPractice {

    
    public static void main(String[] args) {

        // delete() method is used to delete the character at the specified index in a string.
        StringBuilder str = new StringBuilder("Hello World");
        str.delete(5, 11); // This will delete " World"
        System.out.println("Original str: " + str); // Output: Hello

        StringBuffer str2 = new StringBuffer("Muskan Sinha");
        str2.delete(6, 12); // This will delete " Sinha"
        System.out.println("Original str2: " + str2); // Output: Muskan

        System.out.println();
        System.out.println();

       // reverse() method is used to reverse the characters in a string.
        StringBuilder str3 = new StringBuilder("Racecar");
        str3.reverse();
        System.out.println("Reversed str3: " + str3); // Output: racecaR

        StringBuffer str4 = new StringBuffer("Malayalam");
        str4.reverse();
        System.out.println("Reversed str4: " + str4); // Output: malyalam

        System.out.println();
        System.out.println();

        // replace() replaces the legth of string with given word
         StringBuilder str5 = new StringBuilder("Hello World");
         str5.replace(6, 11, "Java");
         System.out.println("Replaced str5: " + str5); // Output: Hello Java  

        StringBuffer str6 = new StringBuffer("richita Sinha");
        str6.replace(7, 12, "Kaur");
        System.out.println("Replaced str6: " + str6); // Output: richita Kaur

    }
    
}
