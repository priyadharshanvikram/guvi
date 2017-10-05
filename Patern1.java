package heloo;

import java.io.*;
import java.util.*;
public class Patern1 {
    public static void main(String args[] ) throws Exception {

    	//Write code here
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	for(int i=0;i<a;i++){
    	    for(int j=0;j<a-1;j++){
    	        System.out.print("*"+" ");
    	    }
    	    System.out.println();
    	}

   }
}

