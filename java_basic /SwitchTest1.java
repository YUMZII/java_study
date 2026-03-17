package day2;

public class SwitchTest1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1; //여기서 1~11 까지임
		
		switch (num % 2) {  // 스위치에 사용할 수 있는 타입 -> int(byte,short,char), String
			case 0 : System.out.println(num + " : 짝수"); 
			  // num % 2 결과가 0이면 (짝수)
        // case 값은 상수이며, int 타입으로 비교됨
		         	 break;
			case 1 : System.out.println(num + " : 홀수");
			  // num % 2 결과가 1이면 (홀수)
        // byte, short, char는 int로 자동 형변환되어 사용 가능
        // 하지만 long은 자동 변환되지 않아 switch에서 사용 불가
	}

}
