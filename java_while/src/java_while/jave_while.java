package java_while;
import java.util.*;

public class jave_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������): ");
		int a, b, n;
		a = scan.nextInt();
		b=scan.nextInt();
		if(b==0) {
			n=a;
		}
		while(b!=0) {
			n=a%b;
			a=b;
			b=n;
		}
		System.out.println( a);
	}

}
