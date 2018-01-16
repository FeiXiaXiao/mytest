package day02;

public class Test10 {

	public static void main(String[] args) {
		int x = 4;
		int y = (--x)+(x--)+(x*10);//赋值符号右边从左往右读
		System.out.println("x = " + x + ",y = " + y);
	}
}
