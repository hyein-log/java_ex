package java_numbergame;
import java.util.*;

public class java_numbergame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int r= rand.nextInt(100);
		int n, tries=0;
		System.out.println("정답을 추측하여 보시오 : ");
		do {
			n = scan.nextInt();
			tries++;
			if (n<r) {
				System.out.println("제시한 정수가 낮습니다.");
			}else if(n>r) {
				System.out.println("제시한 정수가 높습니다.");
			}
		}while(n !=r);
			System.out.println("시도횟수 : "+tries);
	}

}
