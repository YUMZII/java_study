package day3;

public class BreakTest2 {      
	public static void main(String[] args) {
		int result;
		unico:for(int dan = 1; dan <= 9; dan++) {// unico, 빠져나가고 싶은 for문 앞에 작성함
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break unico; //자바의 식별자 규칙 내규에 맞게 작성하면 됨
				//그냥 break;는 가장 가까운 for문 만 나감
        //만약에 break;가 없다면 30보다 큰 수만 출력,
        //있어서 30보다 작은 수만 출력
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}
