package cn.itcast.Demo;

public class ForBreak {

	public static void main(String[] args) {
		for(int i = 0;i<4;i++){
			System.out.println("i = "+i);
			for(int j = 0;j<4;j++){
				System.out.println("j = "+j);
				if(j == 2){
					System.out.println("----------");
					break;
				}
				System.out.println("#####");
			}
		}
	}

}
