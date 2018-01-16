package cn.itcast.Demo;

public class While {

	public static void main(String[] args) {
		int i = 17703,sum = 0,temp =i;
		while(temp!=0){
			sum = sum*10 + temp%10;
			temp /= 10;
			System.out.println("-----------"+temp);
		}
	}

}
