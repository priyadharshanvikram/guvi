package nobiee007;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the factorial : ");
		int n=s.nextInt();
		int a=1;
		for(int i=n;i>0;i--) {
			a*=i;
		}
       System.out.println("factorial of given number is : "+a);
	}

}
