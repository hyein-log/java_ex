package java_search;
import java.util.*;
public class java_search {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
		int n = scan.nextInt();
		int x=0;
		int [] array = new int [10];
		for(int i=0; i<array.length; i++) {
			System.out.print("�迭���� �Է��Ͻÿ�: ");
			array[i]=scan.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			if(n==array[i]) {
			x=i;	
			}
		}
		System.out.println(n+"���� "+(x+1)+"��ġ�� �ֽ��ϴ�.");
	}

}
