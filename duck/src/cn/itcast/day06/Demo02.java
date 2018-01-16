package cn.itcast.day06;

public class Demo02 {

	public static void main(String[] args) {
		System.out.println("相差的个数:"+(huiWen(7)-huiWen(5)));
//		System.out.println(huiWen(7));
	}
public static int huiWen(int i){
	int count = 0,temp = 9,min = 1,max = 9,sum;
	if(i == 1){
		min = 0;
	}
	while(i>1){
		min *=10;
		temp *= 10;
		max = max+temp;
		i -= 1;
	}
	for(int j=min;j<=max;j++){
		sum = 0;
		temp = j;
		while(temp!=0){
			sum = sum*10 + temp%10;
			temp /= 10;
		}
		if(j==sum){
			++count;
//			System.out.println(j);
		}
	}
	return count;
}
//低效版
public static int huiWen2(int i){
	int count = 0,temp = 9,min = 1,max = 9,i2=i;
	int[] arr = new int[i2];
	boolean b;
	if(i == 1){
		min = 0;
	}
	while(i>1){
		min *=10;
		temp *= 10;
		max = max+temp;
		i -= 1;
	}
//	System.out.println("min = "+min);
//	System.out.println("max = "+max);
	for(int j=min;j<=max;j++){
		b = true;
		for(double n=0;n<i2;n++){
			if(n == 0){
				arr[(int)n] = j%10;
			}else{
				arr[(int)n] = (int)(j/(Math.pow(10,n))%10);
			}
		}
		for(int n=0;n<=arr.length/2;n++){
			int m = arr.length-1-n;
			if(arr[n] != arr[m]){
				b = false;
				break;
			}
		}
		if(b){
			++count;
//			System.out.println(j);
		}
	}
	return count;
}
}
