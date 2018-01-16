package cn.itcast.day05;
import java.util.Random;
public class Demo02 {

	public static void main(String[] args) {
		Random r = new Random();
		int x = Math.abs(r.nextInt()%100)+1;
		int y = Math.abs(r.nextInt()%100)+1;
		System.out.println(name(x,y));
	}
public static int name(int a,int b){
	return a+b;
}
}
