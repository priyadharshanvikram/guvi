package nobiee007;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int count = 0,a1;
     int i=1;
    while(i<n){
    	if(n%i!=0)
         count++;
    		i++;
    }
    System.out.println(count);
	}

}
