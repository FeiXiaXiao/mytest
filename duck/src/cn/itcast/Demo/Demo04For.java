package cn.itcast.Demo;

public class Demo04For {

	public static void main(String[] args) {
		int x,y,z,count=0;
		for(int i=100;i<=999;i++){
			x=i%10;
			y=i/10%10;
			z=i/100;
			if(i==x*x*x+y*y*y+z*z*z){
				count +=1;
			}
		}
		System.out.println("水仙花数有"+count+"个");
	}

}
