package nobiee007;

import java.util.Scanner;

public class Prime2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr range : ");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			for(int j=1;j<=a/2;j++)
			{
				if(i%j!=0)
				{
					System.out.println(i);
                }
			}
		}
	}
}
