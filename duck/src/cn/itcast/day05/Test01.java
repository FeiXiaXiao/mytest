package cn.itcast.day05;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		System.out.println(name(arr));
	}
public static int name(int[] a) {
	int temp=0;
	for(int i=0;i<=a.length-1;i++){
		temp = a[temp]>a[i]?temp:i;
	}
	return temp;
}
}
