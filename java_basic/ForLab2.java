package day3;

//[ 실습3 ] 모양 출력(중첩 for)
//1. ForLab9 라는 클래스를 생성한다.
//2. 다음과 같은 결과가 되도록 구현한다.
//
//   ********** 
//	 	********** 
//  	  ********** 
// 	   	  ********** 
//	   		 **********

public class ForLab9 {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) { // 총 다섯 번 반복함
			for (int j=0; j<i; j++) { // 공백을 나타내는데,
				System.out.print(" "); //첫 턴에는 0으로 출력되지 않음, 다음 턴 부터 한칸씩 뒤로 감
			}
			for (int k=0; k<10; k++) { // 10개 별 출력됨
				System.out.print("*");
			}
			System.out.println(); //다음 줄로 넘어감, 맨 위에 for문으로 다시 올라감
		}
	}
}
