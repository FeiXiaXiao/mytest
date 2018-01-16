package day03;
import java.util.Scanner;
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入运算式：");
		int x = sc.nextInt();
		String str = sc.next();
		char c = str.charAt(0);
		int y = sc.nextInt();
		int total;
		switch (c) {
		case '+':
			total = x+y;
			System.out.println(x+"+"+y+"="+total);
			break;
		case '-':
			total = x-y;
			System.out.println(x+"-"+y+"="+total);
			break;
		case '*':
			total = x*y;
			System.out.println(x+"*"+y+"="+total);
			break;
		case '/':
			System.out.println(x+"/"+y+"="+(x/(double)y));
			break;
		default:
			break;
		}
		sc.close();
	}

}
