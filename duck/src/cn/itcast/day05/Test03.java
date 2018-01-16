package cn.itcast.day05;
/*
1.定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
*/
public class Test03 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr2 = {11,22,33,44,55,66,77};
		int[] arr3 = {1,2,3,4,5,6,7};
		int[] arr4 = {56,76,87,98,45};
		//测试equals
		System.out.println(equals(arr,arr2));
		System.out.println(equals(arr,arr3));
		//测试fill
		System.out.println("-----------------分割线----------------");
		System.out.println("arr4:"+arr4[0]+arr4[1]+arr4[2]+arr4[3]+arr4[4]);
		fill(arr4,1);
		System.out.println("arr4:"+arr4[0]+arr4[1]+arr4[2]+arr4[3]+arr4[4]);
		System.out.println("-----------------分割线----------------");
		fill(arr4,1,4,2);
		System.out.println("arr4:"+arr4[0]+arr4[1]+arr4[2]+arr4[3]+arr4[4]);
		//测试copyOf
		System.out.println("-----------------分割线----------------");
		int[] arr5 = copyOf(arr4,5);
		System.out.println("arr5:"+arr5[0]+arr5[1]+arr5[2]+arr5[3]+arr5[4]);
 		//测试copyOfRange
		System.out.println("-----------------分割线----------------");
		arr5 = copyOfRange(arr4,1,4);
		System.out.println("arr5:"+arr5[0]+arr5[1]+arr5[2]+arr5[3]);
	}
public static boolean equals(int[] arr1,int[] arr2){
	boolean b = false,c = true;
	if(arr1.length==arr2.length){
		b = true;
		for(int i=0;i<=arr1.length-1&&c;i++){
			if(arr1[i]!=arr2[i]){
				c = false;
			}
		}
	}
	if(b&&c){
		return true;
	}else{
		return false;
	}
}
//2.定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
public static void fill(int[] arr,int value){
	for(int i=0;i<=arr.length-1;i++){
		arr[i] = value;
	}
}
//3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),
//功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
public static void fill(int[] arr,int fromIndex,int toIndex,int value){
	for(int i=fromIndex;i<=toIndex;i++){
		arr[i] = value;
	}
}
//4.定义一个方法copyOf(int[] arr, int newLength),功能:将
//数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
public static int[] copyOf(int[] arr, int newLength){
	int[] arr2 = new int[newLength];
	for(int i=0;i<=arr2.length-1;i++){
		arr2[i] = arr[i];
	}
	return arr2;
}
//5.定义一个方法copyOfRange(int[] arr,int from, int to),功能:将数组arr中
//从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中,并将新数组返回
public static int[] copyOfRange(int[] arr,int from, int to){
	int temp = to-from;
	int[] arr2 = new int[temp+1];
	for(int i=0;i<=arr2.length-1;i++){
		arr2[i] = arr[from+i];
	}
	return arr2;
}
}
