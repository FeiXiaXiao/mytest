package cn.itcast.Demo;

public class Test01 {
//new 出来的都是对象，属于引用类型，为什么结果预判不同
	static int[] i;
	public static void main(String[] args) {
		String s = new String("333");
		System.out.println(s);
		a(s);
		System.out.println(s);
		b();
		System.out.println("i = "+i);
		System.out.println("i[0] = "+i[0]);
	}
public static void a(String a){
	a = "sdsdsds";
}
public static void b(){
	int[] b = new int[1];
	b[0] = 11;
	System.out.println("b = "+b);
	System.out.println("b[0] = "+b[0]);
	i = b;
}
}
