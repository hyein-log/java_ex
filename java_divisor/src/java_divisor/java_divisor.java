package java_divisor;
import java.util.*;
public class java_divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.print(" "+i);
		}
	}

}
