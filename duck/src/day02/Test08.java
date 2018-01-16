package day02;
import java.util.Scanner;
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入a：");
		int a = sc.nextInt();
		System.out.println("请输入b：");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		sc.close();
		System.out.println("交换后a = "+a+"，b = "+b);
	}

}
