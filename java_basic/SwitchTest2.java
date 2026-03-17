package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101); //0~100
		char credit;
		switch(score/10) {
		case 10 :
		case 9 :
			credit = 'A';
			break;
		case 8 :
			credit = 'B';
			break;	
		case 7 :
			credit = 'C';
			break;
		case 6 :
			credit = 'D';
			break;
		default : //default가 없으면 에러가 뜨는 이유는, credit값을 선언 안 해줬기 때문임
			credit = 'F';	// 그래서 6보다 작은 값이 나오면 에러임, credit 값이 없기 때문임
		}	
		System.out.println(score + " : " + credit);
	}
}
