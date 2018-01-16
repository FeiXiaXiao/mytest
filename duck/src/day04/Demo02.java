package day04;

import java.util.Random;

public class Demo02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Random r = new Random();
		for(int i=0;i<=2;i++){
			arr[i] = Math.abs(r.nextInt()%10);
		}
		for(int i=0;i<=2;i++){
			System.out.println(arr[i]);
		}
	}

}
