package nobiee007;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string to reverse : ");
		String str=s.next();
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("Reversed String is : "+reverse);

	}

}
