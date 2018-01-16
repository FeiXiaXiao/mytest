package day02;
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x=sc.nextInt();
		int y=((x%2==0)?0:1);
		System.out.println(y);
		sc.close();
	}

}
