public class TwoArrayLab2 {
	public static void main(String args[]) {
		char arr[][] = {
         		{ 'B', 'C', 'A', 'A'},
         		{ 'C', 'C', 'B', 'B'},
         		{ 'D', 'A', 'A', 'D'},
       		};
		
		int[] count = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 'A')count[0]++;
				else if(arr[i][j] == 'B')count[1]++;
				else if(arr[i][j]=='C')count[2]++;
				else if(arr[i][j]=='D')count[3]++;
			}
		}
		System.out.println("A 는 " +count[0] +" 입니다.");
		System.out.println("B 는 " +count[1] +" 입니다.");
		System.out.println("C 는 " +count[2] +" 입니다.");
		System.out.println("D 는 " +count[3] +" 입니다.");
	}

}
