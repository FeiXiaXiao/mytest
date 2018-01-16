package cn.itcast.day05;
import java.util.Scanner;
public class Demo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数：");
		int x = sc.nextInt();
		System.out.println(name(x));
		sc.close();
	}
public static char name(int x) {
	if(x<0||x>100){
		return 'F';
	}else if(x>=90&&x<=100){
		return 'A';
	}else if(x>=80){
		return 'B';
	}else if(x>=70){
		return 'C';
	}else if(x>=60){
		return 'D';
	}else{
		return 'E';
	}
}
}
