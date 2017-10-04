import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=a;
		int b=String.valueOf(a).toString().length();
        int v=0;
		while(a>0) {
        	v+=Math.pow(a%10, b);
        	a/=10;
        }
		if(v==c)
		System.out.println("Armstrong Number");
		else
		System.out.println("Not an Armstrong Number");
	}

}
