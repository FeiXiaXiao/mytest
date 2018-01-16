package day02;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("姓名：");
		String name = sc.next();
		System.out.println("年龄：");
		int age = sc.nextInt();
		System.out.println("身高：");
		int high = sc.nextInt();
		System.out.println("我的姓名是"+name+"，年龄"+age+"，身高"+high);
		sc.close();
	}

}
