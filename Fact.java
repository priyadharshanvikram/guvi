import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int v=a;
		while(a>1) {
			v*=(a-1);
			a--;
			
		}
		System.out.println(v);

	}

}
