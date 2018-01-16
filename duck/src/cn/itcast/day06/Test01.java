package cn.itcast.day06;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i<arr.length;i++) {
			System.out.println("输入第"+(i+1)+"个整数：");
			arr[i] = sc.nextInt();
		}
		System.out.print("原数组：");
		printArr(arr);
		System.out.print("处理后的数组：");
		printArr(sortArr(arr));
		sc.close();
	}
//将奇数放在数组的左侧，偶数放在数组的右侧	
public static int[] sortArr(int[] arr){
	int[] brr = new int[arr.length];
	int j = 0;
	int n = brr.length-1;
	for (int i = 0;i<arr.length;i++) {
		if (arr[i]%2 == 1) {
			brr[j] = arr[i];
			++j;
		} else {
			brr[n] = arr[i];
			--n;
		}
	}
	return brr;
}
//打印原数组和处理后的数组
public static void printArr(int[] arr){
	System.out.print("[");
	for(int i = 0;i<arr.length;i++){
		System.out.print(arr[i]);
		if(i!=arr.length-1){
			System.out.print(",");
		}
	}
	System.out.println("]");
}
}
