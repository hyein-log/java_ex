package java_minmax;
import java.util.*;
public class java_minmax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = new int[10];
		
		System.out.println("�ּҰ��� ���غ��ô�.");
		for(int i =0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		int min= array[0];
		for(int i =1; i<array.length; i++) {
			if(min>array[i])
				min=array[i];
		}
		System.out.printf("�ּҰ��� "+ min+"�Դϴ�.");
	}

}
