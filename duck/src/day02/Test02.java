package day02;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int x = sc.nextInt();
		String s = x>=60?"及格":"不及格";
		System.out.println(s);
		/*if(x>100){
			System.out.println("不诚实的小孩，就该下地狱！！！");
		}else if(x>=60){
			System.out.println("及格");
		}else if(x>=0){
			System.out.println("不及格");
		}else{
			System.out.println("厉害了");
		}*/
		sc.close();
	}

}
