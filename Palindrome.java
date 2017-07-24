package nobiee007;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String reverse=new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(reverse)){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not a palindrome");
		}

	}

}
