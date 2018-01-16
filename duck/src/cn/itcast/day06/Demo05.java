package cn.itcast.day06;
import java.util.Scanner;
public class Demo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入两个整数：");
		int x = sc.nextInt();
		int y = sc.nextInt();
		double[] arr = returnNum(x,y);
		System.out.println(x+" + "+y+" = "+arr[0]);
		System.out.println(x+" - "+y+" = "+arr[1]);
		System.out.println(x+" * "+y+" = "+arr[2]);
		System.out.println(x+" / "+y+" = "+arr[3]);
		sc.close();
	}
public static double[] returnNum(int x,int y){
	double[] brr = new double[4];
	brr[0] = x+y;
	brr[1] = x-y;
	brr[2] = x*y;
	brr[3] = x/(double)y;
	return brr;
}
}
