package cn.itcast.day06;

import java.util.Scanner;
             
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i = 0;i<arr.length;i++){
			System.out.println("输入第"+(i+1)+"个数：");
			arr[i] = sc.nextInt();
		}
		overTurn(arr);
		sc.close();
	}
public static void overTurn(int[] arr){
	int min = 0;
	int temp;
	int max = arr.length-1;
	System.out.println("------------");
	//将arr数组中的内容反转
	while (min<max) {
		temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		min++;
		max--;
	}
	//将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
	for (int i = 0;i<arr.length;i++) {
		if (i%2 == 1 && i+2<=arr.length-1) {
			temp = arr[i];
			arr[i] = arr[i+2];
			arr[i+2] = temp;
		}
	}
	//最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换 
	if (arr.length%2 == 0) {
		temp = arr[1];
		arr[1] = arr[arr.length-1];
		arr[arr.length-1] = temp;
	} else {
		temp = arr[1];
		arr[1] = arr[arr.length-2];
		arr[arr.length-2] = temp;
	}
	//打印最终的数组(实现了1-4步之后的数组)
	System.out.print("最终的数组：[");
	for(int i = 0;i<arr.length;i++){
		System.out.print(arr[i]);
		if (i!=arr.length-1) {
			System.out.print(",");
		}
	}
	System.out.println("]");
}
}
