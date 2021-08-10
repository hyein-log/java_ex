package java1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class java1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하시오");
		String name = scan.nextLine();
		System.out.print("나이를 입력하시오");
		int age = scan.nextInt();
		System.out.println(name+"님 안녕하세요!"+age+"살이시네요");
		LocalDateTime timePoint = LocalDateTime.now();
		LocalDate theDate = timePoint.toLocalDate();
		Month month = timePoint.getMonth();
		int day = timePoint.getDayOfMonth();
		int currentHour = timePoint.getHour();
		System.out.println(timePoint);
		System.out.println(theDate);
		System.out.println(month);
		System.out.println(day);
		System.out.println(currentHour);
	}

}
