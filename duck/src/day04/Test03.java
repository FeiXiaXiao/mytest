package day04;
import java.util.Random;
public class Test03 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[3];
		int count=0;
		for(int i=0;i<arr2.length;i++){
			int temp = r.nextInt(10);
			arr2[i] = arr[temp];
			count +=arr2[i];
			System.out.println(arr2[i]);
		}
		System.out.println(count);
	}

}
