package java_random;
import java.util.*;
public class java_random {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("난수의 개수 : ");
	int n = scan.nextInt();
	int sum=0;
	
	Random rand = new Random();
	
	for(int i=0; i<n; i++) {
		int r= rand.nextInt(100);
		sum += r;
		System.out.print(" "+r+"|"+ sum);
	}
	System.out.print("\n"+ sum);
	}

}