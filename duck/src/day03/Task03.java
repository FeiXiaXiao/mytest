package day03;

public class Task03 {
	public static void main(String[] args) {
		int x = 2,y=3;
		switch(x)
		{
			case 1:
				y++;
				System.out.println("y="+y);
			case 4:
				y++;
				System.out.println("y="+y);
			case 2:
				y++;
				System.out.println("y="+y);
			default:
				y++;
				System.out.println("y="+y);
		}
		System.out.println("y="+y);//y=5
	}
}