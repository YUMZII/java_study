package day2;
//[ 실습 6 ]
//1. ForLab6 이라는 클래스를 만든다.
//2. 3부터 10사이의 난수를 추출한다.(첫 번째 난수)
//3. 1부터 3사이의 난수를 추출한다.(두 번째 난수)
//4. 두 번째 난수값이 1이면 "*"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
//    두 번째 난수값이 2이면 "$"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
//    두 번째 난수값이 3이면 "#"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
public class ForLab6 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*8)+3;
		int num2 = (int)(Math.random()*3)+1;
		
		char ch;
		
		if (num2 == 1) {
			ch='*';
		}else if (num2 == 2){
			ch='$';
		}else {
			ch = '#';
		}
		for(int i = 0; i<num; i++) {
			System.out.print(ch);
		}
	}
}
