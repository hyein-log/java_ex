package java_lottery;
import java.util.*;

public class java_lottery {

	public static void main(String[] args) {
		System.out.println("�ζ�Ȯ���� �˾ƺ��ô�.");
		int n=6;
		int odds=1;
		
		for(int i=0; i<n; i++) {
			odds = odds*(45-i)/(i+1);
		}
		System.out.println("�ζ�Ȯ���� : 1/"+ odds);
//		45*44*43*42*41*40/1*2*3*4*5*6
	}

}
