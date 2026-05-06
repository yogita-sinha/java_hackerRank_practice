import java.util.*;
import java.lang.*;
import java.io.*;
public class codeChef_star237_election {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int n , k;
		n = sc.nextInt();
		k = sc.nextInt();
		int chef_needs = (n/2)+1;
		int required_seats = chef_needs - k;
		if(chef_needs <= k){
		    System.out.println("0");
		}
		else {
		    System.out.println(required_seats);
		}

	}
}
