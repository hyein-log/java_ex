package java_search;
import java.util.*;
public class java_search {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오: ");
		int n = scan.nextInt();
		int x=0;
		int [] array = new int [10];
		for(int i=0; i<array.length; i++) {
			System.out.print("배열값을 입력하시오: ");
			array[i]=scan.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			if(n==array[i]) {
			x=i;	
			}
		}
		System.out.println(n+"값은 "+(x+1)+"위치에 있습니다.");
	}

}
