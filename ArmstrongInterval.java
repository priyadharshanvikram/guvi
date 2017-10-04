import java.util.Scanner;

public class ArmstrongInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c;
		int v;
		int x;
		for(int i=a;i<=b;i++) {
			x=i;
			v=0;
			c=String.valueOf(x).toString().length();
			while(x>0) {
	        	v+=Math.pow(x%10, c);
	        	x/=10;
	        }
			if(v==i) {
				System.out.println(v+" ");
			}
		}

	}

}
