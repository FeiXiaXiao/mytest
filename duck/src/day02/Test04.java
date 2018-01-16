package day02;

public class Test04 {

	public static void main(String[] args) {
		int q = 123;
		int x = q%10;
		int y = q/10%10;
		int z = q/100;
		System.out.println("个位"+x+"，十位"+y+"，百位"+z);
	}

}
