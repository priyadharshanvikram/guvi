package nobiee007;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n/2;i++){
			if(i*i==n){
				System.out.println("power of a number : "+i);
			}
		}

	}

}
