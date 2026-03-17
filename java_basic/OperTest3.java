package day2;
public class OperTest5 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
  // Math.random()은 0.0 이상 1.0 미만의 실수를 반환한다.
  // 여기에 10을 곱하면 0.0 이상 10.0 미만이 된다.
  // (int)로 형변환하면 소수점이 버려져서 0~9가 된다.
  // 마지막으로 +1을 해서 1~10 범위의 정수가 된다.
		char result = num % 2 == 1 ? '홀' : '짝'; //조건 ? 참일때 : 거짓일때 -> 홀, 짝이 문자라서 char를 사
		System.out.println(num+"은 "+result+"수입니다.");
		System.out.printf("%d은 %c수입니다.\n", num, result); //printf - format 문자: 출력할 값의 "형식(타입)"을 지정하는 표시
    // %d → 정수 출력
    // %c → 문자 출력
    // \n → 줄바꿈
		System.out.println(num+"은 "+(num % 2 == 1 ? '홀' : '짝')+"수입니다."); // 괄호를 한 이유는 우선순위가 낮아서 그럼
	}
}
