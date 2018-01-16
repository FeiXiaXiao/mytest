package cn.itcast.day06;
import java.util.Scanner;
public class Demo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		int[] arr = {1,4,5,3,25,45,23,10,3,3};
		System.out.println(i+"在数组中出现了"+Count(arr,i)+"次");
		sc.close();
	}
public static int Count(int[] arr,int n){
	int count = 0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==n){
			++count;
		}
	}
	return count;
}
}
