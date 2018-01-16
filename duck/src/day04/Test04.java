package day04;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int n = sc.nextInt();
		int count = 0;
		double avg = 0;
		int sum = 0;
		int[] arr = new int[n];
		for(int i=0;i<=n-1;i++){
			arr[i] = r.nextInt(101);
		}
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]>=0 && arr[i]<60){
				count +=1;
			}
			sum += arr[i];
			avg = (double)sum/arr.length;
		}
		System.out.println("不及格人数："+count+"\n班级平均分："+avg);
		sc.close();
	}

}
