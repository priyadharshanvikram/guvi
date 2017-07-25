package nobiee007;

import java.util.Scanner;

public class Evenbit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr range : ");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}

	}

}
