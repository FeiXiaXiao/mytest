package cn.itcast.day06;

import java.util.Random;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int[] arr = crateArrs();
		int i = indexArrs(arr);
		changeArrs(arr,i);
		System.out.println("变换后数组：");
		printArrs(arr);
	}
//1.提示用户输入n个整数，存入到int数组中
public static int[] crateArrs(){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入数组长度：");
	int n = sc.nextInt();
	while(n<3){
		System.out.println("请输入数组长度：");
		n = sc.nextInt();
		if(n>2){
			break;
		}
	}
	int[] arr =new int[n];
	for (int i = 0;i<arr.length;i++) {
		System.out.println("请输入第"+(i+1)+"个数：");
		arr[i] = sc.nextInt();
	}
	System.out.println("原数组：");
	printArrs(arr);
	return arr;
}
/*2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
（需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）*/
public static int indexArrs(int[] arr){
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	System.out.println("请输入索引值：");
	int i = sc.nextInt();
	if (i<=00 || i>=arr.length) {
		i = r.nextInt(arr.length-2)+1;
		System.out.println("您输入的索引值有误，已自动生成索引值："+i);
	}
	return i;
}
//3.将2中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
public static void changeArrs(int[] arr,int i){
	int temp;
	if (i>0 && i<arr.length-1) {
		temp = arr[i-1];
		arr[i-1] = arr[i+1];
		arr[i+1] = temp;
	} 
}
//4.打印数组
public static void printArrs(int[] arr){
	System.out.print("[");
	for (int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]);
		if (i != arr.length-1) {
			System.out.print(",");
		}
	}
	System.out.println("]");
}
}
