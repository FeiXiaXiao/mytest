package cn.itcast.day05;

public class Demo04 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println(name(arr));
	}
public static int name(int[] a){
	int temp=a[0];
	for(int i=0;i<=a.length-1;i++){
		temp = temp<a[i]?temp:a[i];
	}
	return temp;
}
}
