package day02;
import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		float x = sc.nextFloat();
		System.out.println("请输入长方形的宽：");
		float y = sc.nextFloat();
		float a = x*y;
		float b = (x+y)*2;
		System.out.println("长方形的面积："+a+"，长方形的周长："+b);
		sc.close();
	}

}
