public class VariableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('1'+1); // 50: 왜냐하면 '1'은 문자가 아니라 내부적으로 숫자(ASCII/Unicode)
    //로 계산 됨 '1'은 49
    System.out.println('A'+1); // 'A'는 65 그래서 66으로 출력
    System.out.println((char)('1'+1)); // 49+1=50 char(50)은 '2' 그래서 2 출력
  }

}
