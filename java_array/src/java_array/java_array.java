package java_array;
import java.util.*;
public class java_array {

	public static void main(String[] args) {
	/*	int []s = new int [10];
		
		for(int i =0; i<s.length; i++)
		{
			s[i] =i;
		}
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" ");
		}*/
		
		double []s = new double[10];
		for(int i =0; i<10; i++) {
			s[i] = i*(0.1);
			System.out.printf("%.1f "
					+ "", s[i]);
		}
	}

}
