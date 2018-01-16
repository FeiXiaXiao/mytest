package cn.itcast.Demo;

public class FangFa {

	public static void main(String[] args) {
		int[] a = {0};
		a(a);
		System.out.println(a);
		System.out.println(a[0]);
	}
public static void a(int[] a){
	System.out.println(a[0]);
	a[0]=10;
}
}
