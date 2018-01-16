package cn.itcast.day06;

public class Demo04 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,2,4,2,4};
		Index(arr,2);
		Index(arr,5);
	}
public static void Index(int[] brr,int key) {
	boolean b = false;
	for (int j = 0;j<brr.length;j++) {
		if (brr[j] == key) {
			b = true;
			System.out.print(j+" ");
		}
	}
	if (b == false) {
		System.out.println("\n数组中没有这个数字");
	}
}
}
