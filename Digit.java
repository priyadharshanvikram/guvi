package nobiee007;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int a=0;
		while(n>0){
	    	n/=10;
	    	a++;

	    }
            System.out.println(a);	   
       
	}

}
