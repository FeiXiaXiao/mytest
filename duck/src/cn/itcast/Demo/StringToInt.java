package cn.itcast.Demo;

public class StringToInt {

	public static void main(String[] args) {
		String s = null;
		int i = 'a';
		char c = 97;
		char x = (char)(c+1);
		c += 3;
		c++;
		if(s==null){
			System.out.println("s is null");
		}
		System.out.println("i = "+i);
		System.out.println("x = "+x);
		System.out.println(c+1);
		System.out.println((char)(c+1));
	}

}
