public class TwoArrayLab1 {
	public static void main(String[] args) {
		
		int arr[][] = {
         		{ 10, 12, 14, 16},
         		{ 18, 20, 22, 24},
         		{ 26, 28, 30, 32},
         		{ 34, 36, 38, 40},
       		};
		
		for(int row=0; row < arr.length; row++) {
			for(int col=0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"\t");
		}System.out.println();
	} 
		
		System.out.println("1행 1열의 데이터 : "+ arr[1][1]);
		System.out.println("3행 4열의 데이터 : "+ arr[2][3]);
		System.out.println("행의 갯수 : "+ arr.length);
		System.out.println("열의 갯수 : "+ arr[0].length);
		
		System.out.print("3행의 데이터들 : ");
		for(int col=0; col< arr[3].length; col++) {
				System.out.print(arr[2][col]+ " ");
			}
		
		System.out.println();
		System.out.print("2열의 데이터들 : ");
		for(int row=0; row < arr[1].length; row++) {
				System.out.print(arr[row][1]+ " ");
		}
		System.out.println();
		System.out.print("왼쪽 대각선 데이터들 : ");
		for(int row=0; row < arr.length; row++) {
				System.out.print(arr[row][row]+ " ");
		}
		System.out.println();
		System.out.print("오른쪽 대각선 데이터들 : ");
		for(int row=0; row < arr.length; row++) {
				System.out.print(arr[row][arr.length -1 -row]+ " ");
		}
		
	}
}
