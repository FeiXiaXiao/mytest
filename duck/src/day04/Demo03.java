package day04;

public class Demo03 {

	public static void main(String[] args) {
		int[] nums = {5,10,5};
		int[] num = new int[nums.length];
		for(int i=0;i<=nums.length-1;i++){
			num[i] = nums[i]*2;
		}
		for(int i=0;i<=num.length-1;i++){
			System.out.println(num[i]);
		}
	}

}
