package day03;
import java.util.Scanner;
public class Task04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入工龄：");
		int a = sc.nextInt();
		System.out.println("请输入基本工资：");
		int b = sc.nextInt();
		String s;
		if(a>=15){
			s = "很遗憾，您的工龄太高了，您的工资无法上调！！！";
		}else if(a>=10){
			s = "您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资5000元，涨后工资"+(5000+b)+"元！！！";
		}else if(a>=5){
			s = "您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资2500元，涨后工资"+(2500+b)+"元！！！";
		}else if(a>=3){
			s = "您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资1000元，涨后工资"+(1000+b)+"元！！！";
		}else if(a>=1){
			s = "您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资500元，涨后工资"+(500+b)+"元！！！";
		}else if(a==0){
			s = "您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资200元，涨后工资"+(200+b)+"元！！！";
		}else{
			s = "您肯定不是我们的员工！！！";
		}
		System.out.println(s);
		sc.close();
	}
}
