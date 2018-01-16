package day04;

public class Demo01 {

	public static void main(String[] args) {
		int[] arr = {1,566,34,45,34};
		int temp=arr[0];
		for(int i =1;i<arr.length;i++){
			if(temp>=arr[i]){
				temp=arr[i];
			}
		}
		System.out.println("最小值是："+temp);
	}

}
