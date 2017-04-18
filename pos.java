package check;
import java.util.*;
public class pos {
public static void main(String args[])
{
	int a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	if(a>0)
	{
		System.out.println("number is positive");
	}
	else
		if(a<0)
	{
		System.out.println("number is negative");
	}
	else
	{
		System.out.println("zero");
	}
}
}
