package day2;
public class OperTest4 {
	public static void main(String[] args) {
		int num=10; // num은 하나의 변수라서 값이 계속 바뀌고 유지됨 -> 계속 누적됨
		System.out.println(num);	  //	10	
		System.out.println(++num);	// 	11 전위 증가: ++num -> 11 출력 -> 11
		System.out.println(++num);	//	12
		System.out.println(++num);	//	13
		
		System.out.println(num++);	//	13	후위 증가 num++ -> 13 출력 -> 13 그 다음에 14로 증가
		System.out.println(num++);	//	14
		
		System.out.println(num);    //	15
		System.out.println(--num);	//	14
		System.out.println(num);		//	14		
	}
}
