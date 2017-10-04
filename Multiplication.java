import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int v=1;
		while(v<=15) {
			System.out.println(v +" * " +a +" = "+(v*a));
			v++;
		}

	}

}
