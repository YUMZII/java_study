package day2;

public class RandomTest {
	public static void main(String[] args) {
		double rand = Math.random();// 자바가 내장하고 있는 api, 대문자애들은 클래스임 
    // 즉 Math 클래스에 있는 random 메서드를 호출
		//double로 random을 받는 이유는, random은 실수임 0.0 <= Math.random < 1.0
		System.out.println(rand);    
		System.out.println(rand*10);
		System.out.println(rand*100);
		System.out.println(rand*6);
		System.out.println((int)(rand*10));   
		System.out.println((int)(rand*100));  
		System.out.println((int)(rand*6));
		
		System.out.println((int)(rand*10)+1);   
		System.out.println((int)(rand*100)+1);  
		System.out.println((int)(rand*6)+1);   
		System.out.println((int)(rand*45)+1);   
	}
}
