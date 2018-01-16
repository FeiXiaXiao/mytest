package cn.itcast.day05;
import java.util.Scanner;
/*
1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
3.在main方法中打印该数字是几位数*/
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = sc.nextInt();
		System.out.println(n+" 是"+valid(n)+"位数字");
		sc.close();
	}
public static int valid(int num){
	int length=0,temp;
	temp = Math.abs(num);
	while(temp>0){
		temp /=10;
		length +=1;
	}
	return length;
}
}
