package cn.itcast.day06;

public class Test04 {

	public static void main(String[] args) {
		statistics();
		questSum();
	}
//求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
public static void statistics(){
	int count = 0;
	System.out.println("1-500之内能同时被2，5，7整除的所有数:");
	for (int i = 1;i<=500;i++) {
		if (i%2==0 && i%5==0 && i%7==0) {
			++count;
			System.out.print(i+" ");
			if (count%5 == 0) {
				System.out.println();
			}
		}
		
	}
	System.out.println("\n1-500之内能同时被2，5，7整除的数的个数："+count);
}
//求100以内能被3整除的数加上能被5整除的数的和
public static void questSum(){
	int sum = 0;
	for (int i = 0;i<=100;i++) {
		if (i%3==0 || i%5==0) {
			sum += i;
		}
	}
	System.out.println("100以内能被3整除的数加上能被5整除的数的和:"+sum);
}
}
