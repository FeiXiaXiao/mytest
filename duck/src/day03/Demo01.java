package day03;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		int x = sc.nextInt();
		if(x>100){
			System.out.println("不诚实的小孩，就该下地狱！！！");
		}else if(x>=90){
			System.out.println("优秀");
		}else if(x>=80){
			System.out.println("好");
		}else if(x>=70){
			System.out.println("良");
		}else if(x>=60){
			System.out.println("及格");
		}else if(x>=0){
			System.out.println("不及格");
		}else{
			System.out.println("厉害了！！！");
		}
		sc.close();
	}

}
