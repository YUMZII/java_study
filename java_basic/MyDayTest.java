package day6;

import java.util.GregorianCalendar;

class MyDay{
	static String birthDay;// static 프로그램 시작 시 한 번만 계산됨
	
	static {
		int year=2000;
		int month=10;// 월이 0부터 시작하기 때문에 0 = 1월/ 9월 = 10월
		int day=12;
		
		GregorianCalendar gc = new GregorianCalendar(year, month -1, day);
		//-1을 해줘야됨
		int week = gc.get(GregorianCalendar.DAY_OF_WEEK);
		String[] dayNames = {" ","월요일","화요일","수요일","목요일", "금요일", "토요일","일요일"};
		//요일도 0부터 시작이기 때문에, 앞에 "" 먼저 넣어줘야됨
		//Week = 5 -> 목요일
		birthDay=dayNames[week];
	}
}

public class MyDayTest {
	public static void main(String[] args) {
		String name = "조윤지";
		System.out.println(name + "는 " + MyDay.birthDay + "에 태어났어요");
	}
}
