package cn.itcast.day06;
import java.util.Random;
public class Demo01 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[5];
		for(int i=0;i<=arr.length-1;i++){
			System.out.println("-----------华丽丽的分割线-----------");
			arr[i] = r.nextInt(100)+1;
			if(arr[i]%10==3 || arr[i]/10%10==3){
				System.out.println("------------华丽丽是谁--------------");
				System.out.println(arr[i]);
			}
		}
	}

}
