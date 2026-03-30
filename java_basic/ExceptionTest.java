import java.util.Random;
class TestException extends Exception {
	 private static final long serialVersionUID = 1L;// 내가 직접 만든 예외 클래스	 
	TestException(String message){// 생성자
		super(message);// 부모클래스 exception한테 메시지를 넘겨주는 것 -> e.getMessage
	}
}
public class ExceptionTest3 {
	public static void main(String[] args)  {
		System.out.println("main()수행시작");
		a();//a() 호출
		System.out.println("main()수행종료");
	}
	static void a()  {
		System.out.println("a()수행시작");
		try {
			b();// b() 호출
		} catch (TestException e){	
			System.out.println("오류 발생 : "+e.getMessage());
		}
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c(); //c() 호출
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean a = new Random().nextBoolean();//랜덤으로 true 또는 false를 하나 뽑음
		if(a){//true면 예외발생
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");
		}else {// false면 그냥 출력
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}
//main()수행시작
//a()수행시작
//b()수행시작
//c()수행시작
//ㅋㅋㅋㅋ
//c()수행종료
//b()수행종료
//a()수행종료
//main()수행종료
