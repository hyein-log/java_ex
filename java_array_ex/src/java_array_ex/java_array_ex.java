package java_array_ex;
import java.util.*;

public class java_array_ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =5, sum=0;
		int [] scores = new int[n];
		for(int i=0; i<scores.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
			sum = sum+scores[i];
		}
		System.out.println("��ռ����� "+ sum/n +" �Դϴ�.");

	}

}
