package cn.itcast.day05;

public class Test04 {

	public static void main(String[] args) {
		print(1340,2017);
	}
public static void print(int fromYear,int toYear){
	for(int i=fromYear;i<=toYear;i++){
		if(i%400==0){
			System.out.println(i);
		}
		if(i%100!=0&&i%4==0){
			System.out.println(i);
		}
	}
}
}
