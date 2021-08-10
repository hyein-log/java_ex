package java_array_ex;
import java.util.*;

public class java_array_ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =5, sum=0;
		int [] scores = new int[n];
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i] = scan.nextInt();
			sum = sum+scores[i];
		}
		System.out.println("평균성적은 "+ sum/n +" 입니다.");

	}

}
