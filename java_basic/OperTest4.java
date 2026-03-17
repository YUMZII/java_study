package day2;

public class OperTest6 {

	public static void main(String[] args) {
		int num1=100, num2=50;
		
		System.out.println(num1>0 || num2>0); // 첫번째항이 참이면 두번째항은 평가안함
		System.out.println(num1>0 || num2==0); //첫번째가 거짓이면 두번째 평가함
		
		System.out.println(num1 + 10 > 110 && num2 % 2 == 0); //  f
		System.out.println(num1>0 && num2 % 2 == 1); // f
		System.out.println(num2 > 50 && ++num1 == 101); // 앞에가 이미 거짓이면 뒤에 평가를 안함, and 연산이라서, 
// 여기서 num1을 101로 착각해서 다음 줄을 틀릴 수 있음
		System.out.println(num1); // 100인데 101로 출력된다고 생각할 수 있지만, 위에 줄 보면 뒤 연산자 평가를 안해서 100이 유지됨
