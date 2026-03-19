package day3;
public class PrintfTest1 {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");	// %n, \n 동일
		System.out.printf("테스트%d입니당\n",10); // 포맷문자랑 뒤에 숫자랑 맞춰야됨		
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);// 10진수 16진수  8진수 문자 
		System.out.printf("%d %2$x %1$o %1$c\n", 100, 50);// 얘는 왜 가능할까? 1$ 있으면 가능
		// 1$는 100이라는 포맷 문자열을 나타나는데, 1$라는 맨 앞에 있는 포맷 문자열을 선택하는 것
		// 2$는 두번째 문자열을 선택하는 것
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n", true);
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678);		
		System.out.printf("%,d원\n", 1000000);			
		System.out.printf("%10d %20d %d %d%d", 10, 20, 30, 40, 50);
		//%10d는 10만큼의 자리너비를 의미함,
		// 공백을 넣어주면 출력값도 공백이 생김
	}
}
//테스트입니당
//테스트10입니당
//100 64 144 d
//100 32 144 d
//가 A ! 3
//true
//100.000000 1.000000e+02
//123.57
//1,000,000원
//        10                   20 30 4050
