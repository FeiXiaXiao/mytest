package cn.itcast.Demo;

public class MaoPao {

	public static void main(String[] args) {
		int[] arr = {3,5,1,4,2};
		int temp;
//		print(arr);
		for (int i = 0;i<arr.length-1;i++) {
			print(arr);
			for (int j = 0;j<arr.length-1-i;j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		print(arr);
	}

	public static void print(int[] arr) {
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
