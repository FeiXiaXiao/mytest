package cn.itcast.day06;


public class Test02 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,3,4,4,4,4};
		countNums(arr);
	}
public static void countNums(int[] arr){
	int count = 0;
	boolean b;
	int[][] brr = new int[2][arr.length];
	for (int i = 0;i<arr.length;i++) {
		b = true;
		for (int j = 0;j<count;j++) {
			if (arr[i] == brr[0][j]) {
				b = false;
				break;
			} 
		}
		if (b) {
			brr[0][count] = arr[i];
			++count;
		}
	}
	for (int i = 0;i<count;i++) {
		for (int j = 0;j<arr.length;j++) {
			if(arr[j] == brr[0][i]){
				++brr[1][i];
			}
		}
		System.out.println("数字"+brr[0][i]+"出现了"+brr[1][i]+"次");
	}
}
}
