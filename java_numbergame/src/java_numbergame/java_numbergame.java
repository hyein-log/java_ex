package java_numbergame;
import java.util.*;

public class java_numbergame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int r= rand.nextInt(100);
		int n, tries=0;
		System.out.println("������ �����Ͽ� ���ÿ� : ");
		do {
			n = scan.nextInt();
			tries++;
			if (n<r) {
				System.out.println("������ ������ �����ϴ�.");
			}else if(n>r) {
				System.out.println("������ ������ �����ϴ�.");
			}
		}while(n !=r);
			System.out.println("�õ�Ƚ�� : "+tries);
	}

}
