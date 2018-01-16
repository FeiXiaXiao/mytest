package cn.itcast.Demo;

public class Point {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] arr1 = {4,5,6};
		int[] temp = arr;
		System.out.println("arr:"+arr);
		System.out.println("arr1:"+arr1);
		System.out.println("temp:"+temp);
		arr = arr1;
		arr1 = temp;
		System.out.println("----------------");
		System.out.println("arr:"+arr);
		System.out.println("arr1:"+arr1);
		System.out.println("temp:"+temp);
		temp = arr;
		System.out.println("----------------");
		System.out.println("arr:"+arr);
		System.out.println("arr1:"+arr1);
		System.out.println("temp:"+temp);
		arr1 = arr;
		System.out.println("----------------");
		System.out.println("arr:"+arr);
		System.out.println("arr1:"+arr1);
		System.out.println("temp:"+temp);//至此，我们丢失了原来的arr数组，除非知道原来arr的地址
		//所以可以认为是地址引用 
		System.out.println(" "+arr[0]+arr[1]+arr[2]);
 	}

}
