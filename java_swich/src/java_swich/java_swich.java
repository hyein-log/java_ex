package java_swich;
import java.util.*;

public class java_swich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month, a, b,c;
		a=28;
		b=30;
		c=31;
		
		System.out.println("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�: ");
		month = scan.nextInt();
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("���� ������ "+ b);
			break;
		case 2:
			System.out.println("���� ������ "+ a);
			break;
			default:
				System.out.print("���� ������ "+c);
				
			
		}
	}

}
