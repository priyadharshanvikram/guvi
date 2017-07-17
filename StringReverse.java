package nobiee007;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String[] s3 = null;
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++){
			s3[i]=new StringBuffer(s2[i]).reverse().toString();
		}
		System.out.println(s3);

	}

}
