package cn.itcast.Demo;
import java.util.Scanner;
public class Demo33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c='s';
		while(c != 'n' && c!= 'N'){
			System.out.println("是否继续");
			c = sc.next().charAt(0);
//			sc.nextLine();
		}
		System.out.println("#############");
		c = 'm';
		for(;c != 'n' && c!= 'N';){
			System.out.println("是否继续");
			c = sc.next().charAt(0);
		}
		sc.close();
	}

}
