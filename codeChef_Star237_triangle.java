import java.util.*;
import java.lang.*;
import java.io.*;
public class codeChef_Star237_triangle {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int x , y , z ;
		    x = sc.nextInt();
		    y = sc.nextInt();
		    z = sc.nextInt();
		    if((x+y>z) && (y+z>x) && (x+z>y)){
		        System.out.println("0");
		    }
		    else {
		        int a[] = {x , y , z };
		        Arrays.sort(a);
		        System.out.println((a[2]+1) - (a[0]+a[1]));
		    }
		    
		}

	}
    
}
