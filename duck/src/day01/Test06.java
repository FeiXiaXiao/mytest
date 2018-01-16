package day01;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("*\n**\n***\n****");
		for(int i=5;i>0;i--){
			for(int j=0;j<=i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
