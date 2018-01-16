package cn.itcast.Demo;
import java.util.Scanner;
public class Demo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入菱形的边长：");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++){
			for(int j=n-1;j>=i+1;j--){
				System.out.print(" ");
			}
			if(i!=0){
				System.out.print('*');
			}
			for(int j=0;j<=2*i-2;j++){
				System.out.print(" ");
			}
			System.out.println('*');
		}
		for(int i=n-2;i>=0;i--){
			for(int j=n-2;j>=i;j--){
				System.out.print(" ");
			}
			if(i!=0){
				System.out.print("*");
			}
			for(int j=0;j<=2*i-2;j++){
				System.out.print(" ");
			}
			System.out.println('*');
		}
		sc.close();
	}

}
