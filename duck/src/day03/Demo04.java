package day03;
import java.util.Scanner;
public class Demo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大于100的三位数");
		int j = sc.nextInt();
		int sum =0;
		for(int i=100;i<=j;i++){
			if(i%10!=7&&i/10%10!=5&&i/100!=3){
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
