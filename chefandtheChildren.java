import java.util.*;
import java.lang.*;
import java.io.*;
public class chefandtheChildren {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    
		    int n , x;
		    n  = sc.nextInt();
		    x  = sc.nextInt();
		    int [] a = new int [n];
		    
		    for(int i=0; i<n; i++){
		        a[i]  = sc.nextInt();
		        
		    }
		    
		    int maxCandies = 0;
		    for(int i=0; i<n; i++){
		        if(a[i] %x ==0){
		            if (a[i]>maxCandies){
		                maxCandies = a[i];
		            }
		        }
		    }
		   System.out.println(maxCandies);
		    
		}

	}
}
