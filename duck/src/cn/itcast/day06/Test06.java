package cn.itcast.day06;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		int[] arr = createArrs();
		int[] brr = createArrs();
		int[] crr = {1,2,3,4,5,6,7,8,9,10};
		int[] drr = {1,2,3,4,5,6,7,8,9,10};
		spliceChar(arr, brr);
		spliceChar(crr, drr);
	}
//创建长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数
public static int[] createArrs(){
	Random r = new Random();
	int[] arr = new int[10];
	for(int i = 0;i<arr.length;i++){
		arr[i] = r.nextInt(100)+1;
	}
	System.out.print("[");
	for(int i = 0;i<arr.length;i++){
		System.out.print(arr[i]);
		if(i!=arr.length-1){
			System.out.print(",");
		}
	}
	System.out.println("]");
	return arr;
}
//将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上
public static void spliceChar(int[] arr,int[] brr){
	String s = "";
	int count = 0;
	boolean b;
	for(int i = 0;i<arr.length;i++){
		//arr与brr比较，如果arr[i]和brr中的每一个元素都不相等，将arr[i]的值拼接进s中 
		b = true;
		for(int j = 0;j<arr.length;j++){
			if(arr[i] == brr[j]){
				b = false;
				break;
			}
		}
		if(b){
			s += arr[i];
			++count;
			System.out.println(s);
		}
		//brr与arr比较，如果brr[i]和arr中的每一个元素都不相等，将brr[i]的值拼接进s中 
		b = true;
		for(int j = 0;j<brr.length;j++){
			if(brr[i] == arr[j]){
				b = false;
				break;
			}
		}
		if(b){
			s += brr[i];
			++count;
			System.out.println(s);
		}
	}
	if(count==0){
		System.out.println("对不起两个数组的所有元素均相同");
	}else{
		System.out.println("字符串s:"+s+"，长度为:"+s.length());
	}
}
}
