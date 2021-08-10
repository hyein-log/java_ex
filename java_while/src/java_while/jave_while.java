package java_while;
import java.util.*;

public class jave_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하시오(큰수, 작은수): ");
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
