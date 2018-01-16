package cn.itcast.day06;
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
public class Test05 {

	public static void main(String[] args) {
		a();
	}
public static void a(){
	double sum = 0,temp;
	for(int i=1;i<=20;i++){
		if (i == 1) {
			temp = 2.0/1;
			sum += temp;
		} else if (i == 2) {
			temp = 3.0/2;
			sum += temp;
		} else {
			temp = questNum(i+1)/questNum(i);
			sum += temp;
		}
		System.out.println("第"+i+"项："+temp);
//		System.out.println("该数列前"+i+"项和："+sum);
	}
	System.out.println("该数列前20项和："+sum);
}
public static double questNum(int n){
	double num;
	if (n == 1) {
		return 1.0;
	} else if (n == 2) {
		return 2.0;
	} else {
		num = questNum(n-2)+questNum(n-1);
		return num;
	}
}
}
