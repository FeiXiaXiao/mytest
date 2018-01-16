package cn.itcast.day05;
import java.util.Scanner;
/*
1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长 
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积*/
public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("长方形的长：");
		int x = sc.nextInt();
		System.out.println("长方形的宽：");
		int y = sc.nextInt();
		System.out.println("圆的半径：");
		int r = sc.nextInt();
		System.out.println("长方形的周长"+perimeter(x,y));
		System.out.println("长方形的面积："+area(x,y));
		System.out.println("圆的周长："+perimeter(r));
		System.out.println("圆的面积："+area(r));
		sc.close();
	}
public static int area(int a,int b){
	return a*b;
}
public static double area(int r){
	return 3.14*r*r;
}
public static int perimeter(int a,int b){
	return (a+b)*2;
}
public static double perimeter(int r){
	return 2*3.14*r;
}
}
