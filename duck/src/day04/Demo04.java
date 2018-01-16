package day04;

import java.util.Scanner;
import java.util.Random;

public class Demo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("请输入一个整数：");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<=arr.length-1;i++){
			arr[i] = r.nextInt(10)+1;
		}
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i] > 5 && arr[i] % 2 == 0){
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
