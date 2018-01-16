package cn.itcast.day05;
import java.util.Scanner;
public class Demo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int i = sc.nextInt();
		name(i);
		sc.close();
	}
	public static void name(int i) {
		for(int j=0;j<=i;j++){
			if(j%2==0){
				System.out.print(j+" ");
			}
		}
	}
}
