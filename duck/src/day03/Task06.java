package day03;

public class Task06 {

	public static void main(String[] args) {
		float f = 0.0001f;
		int count = 0;
		while(f<8848){
			f *=2;
			count++;
		}
		System.out.println("折叠"+count+"次，可以折成珠穆朗玛峰的高度");
	}
}
