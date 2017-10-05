package heloo;

import java.util.Scanner;

public class Patern2 {

	public static void main(String args[] ) throws Exception {

    	//Write code here
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	for(int i=1;i<=a;i++){
    	    for(int j=0;j<a;j++){
    	        System.out.print(i + " ");
    	    }
    	    System.out.println();
    	}

   }

}
