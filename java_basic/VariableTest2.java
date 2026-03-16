package day1;

public class VariableTest6 {
	public static void main(String[] args) {
		System.out.println(100); 					// 
		int num;  
		num = 1000;
		System.out.println("연산 전 : "+num);	
		num = 10+20;
		System.out.println("연산 후 : "+num);	
		
		char munja = 'A'; // char이 하나씩 증가함, 다양한 방법이 있음
		System.out.print(munja); 					
		munja++; 
		System.out.print(munja); 					
		munja += 1; ;											
		System.out.print(munja); 					
		munja = (char)(munja+1); 
		System.out.println(munja); 				
	}
}

//100
//연산 전 : 1000
//연산 후 : 30
//ABCD
