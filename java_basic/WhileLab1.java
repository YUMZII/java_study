package day3;

// [ 실습3 ] - while 문은 무한루프 처리하고 루프를 끝낼 때는 break 문 사용

// 1. WhileLab3 라는 클래스를 생성한다.
// 2. 수행을 시작하면 "[ 수행시작 ]" 이라는 메시지를 출력한다.
// 3. while 문으로 다음 기능을 반복해서 처리한다.
// 0부터 30사이의 난수를 추출한다.
// 추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
// 계속 난수 추출과 출력을 반복하다가 0이 추출되거나 27~30이 추출되면 반복을 끝낸다.
    
//     반복하는 동안 출력형식 :  	
//     1-A, 65, 0x41
//     5-E, 69, 0x45
//     :
    
// 4. 수행을 끝내기 전에는 "[ 수행 종료 ]- 출력횟수는 x 번"를 출력한다.

// 출력 횟수를 카운팅하는 것은 직접 구현해야 하며
// 16진수 출력시 숫자앞의 0x는 직접 붙여서 출력해야 한다.

public class WhileLab3 {
	public static void main(String[] args) {
		System.out.print("[수행시작]\n"); // 1. 수행시작이라는 메시지 먼저 출력
		int count=0; // 0으로 초기값 세팅
		
		while(true) {
			int num0 = (int)(Math.random()*31); //2. 0부터 30까지 난수 추출
			if(num0 ==0 || num0 >= 27) {// 3. 난수가 0이거나 27보다 크면 반복을 끝낸다
				break;
			}
			char char1 = (char)(num0+64); // 4. 아스킬 코드를 추출 -> 1+64=A가 나옴
			System.out.println(num0 + "-"+char1+","+(int)char1+",0x"+Integer.toHexString(char1).toUpperCase());
			//반복하는 동안 출력 형식 1-A, 65, 0x41
      count++; //출력 횟수를 출력하기 위해 count 변수를 만들어주고 횟수 기록
		}
		System.out.println("[수행 종료]-출력획수는"+ count+" 번");
	}

}
