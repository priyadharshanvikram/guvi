package heloo;

import java.util.Scanner;

public class Patern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	for(int i=0;i<a;i++){
    	    for(int j=0;j<5;j++){
    	        System.out.print((char)(j+65)+" ");
    	    }
    	    System.out.println();
    	}

	}

}
