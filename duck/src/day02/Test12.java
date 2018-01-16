package day02;

public class Test12 {

	public static void main(String[] args) {
		short s = 30;
		int i = 50;
		s += i;
		System.out.println("s="+s);//s=80
		int x = 0;
		int y = 0;
		int z = 0;
		boolean a,b;
		a = x>0 & y++>1;
		System.out.println("a="+a);//a=false
		System.out.println("y="+y);//y=1
		b = x>0 && z++>1;
		System.out.println("b="+b);//b=false
		System.out.println("z="+z);//z=0
		a = x>0 | y++>1;
		System.out.println("a="+a);//a=false
		System.out.println("y="+y);//y=1
		b = x>0 || z++>1;
		System.out.println("b="+b);//b=false
		System.out.println("z="+z);//z=1		
	}

}
