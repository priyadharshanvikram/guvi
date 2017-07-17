package nobiee007;

import java.util.Scanner;

public class F1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the integer to reverse : ");
		int n=s.nextInt();
		int a=0;
		while(n!=0) {
			a=(a*10)+n%10;
			n/=10;
		}
		System.out.println(a);

	}

}


