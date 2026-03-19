package day2;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num;
		for(num=1; num <= 10; num++) // 초기식 → 조건식 → {} 안에 계산 수행하고 → 증감식 이 순서
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num);  // 9로 된 다음에 +2 됨, 11은 10보다 크기 때문에
		//for문을 나감. 그리고 11인 값으로 밖에 프린트문에 찍혀서 출력함
		}
}
