package cn.itcast.Demo;
import java.util.Random;
public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(101);
		System.out.println(x);
	}

}
