package day2;

public class OperTest2 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		System.out.println("-----int와 int-----");
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2); // 먼저 double로 변경하고 연산함, 단 실제로 num1,2 타입이 변하는 건 아님
		System.out.println(num1 % num2);
		double num3 = 5.0;
		double num4 = 3.0;
		System.out.println("-----double과 double-----");
		System.out.println(num3 + num4);
		System.out.println(num3 - num4);
		System.out.println(num3 * num4);
		System.out.println(num3 / num4);
		System.out.println(num3 % num4);
		System.out.println("-----double과 int-----"); // 정수와 실수가 만나면 실수에 맞춰짐. 왜? 실수가 더 범위가 넓음
		System.out.println(num3 + num2);
		System.out.println(num3 - num2);
		System.out.println(num3 * num2);
		System.out.println(num3 / num2);
		System.out.println(num3 % num2);
	}
}
