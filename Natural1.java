package nobiee007;

import java.util.Scanner;

public class Natural1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		for(int i=1;i<=n;i++){
			a+=i;
		}
		System.out.println("sum of natural numbers is : "+a);

	}

}
