package cn.itcast.Demo;

public class Demo01 {
	
	public static void main(String[] args) {
		char c = 256;
		char e = 'c';
		c = (char)(e+1);
		c++;
		byte b = 120;
		byte t = 120;
		b += t;
		int i=3;
		i = i+1;
		short s = 4000;
		s = (short)(s+1);
		System.out.println(c);
		System.out.println(++b);
		System.out.println(++s);
	}
}
