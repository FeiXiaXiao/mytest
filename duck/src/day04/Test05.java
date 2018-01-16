package day04;
import java.util.Scanner;
import java.util.Random;
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("请输入班级总组数：");
		int a = sc.nextInt();
		System.out.println("请输入班级中每组的人数：");
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		int[] count = new int[a];
		double[] avg = new double[a];
		int countAll = 0;
		double avgAll = 0,avgMax = 0,avgSum = 0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=arr[0].length-1;j++){
				arr[i][j] = r.nextInt(101);
			}
		}
		for(int i=0;i<arr.length;i++){
			sum = 0;
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j] >= 0 && arr[i][j] <60){
					count[i] +=1;
				}
				sum += arr[i][j];
				avg[i] = (double)sum/arr[0].length;
			}
			countAll += count[i];
			avgSum +=avg[i];
			avgMax = avgMax>avg[i] ?avgMax:avg[i];
			System.out.println("第"+(i+1)+"组不及格人数为："+count[i]+"人");
			System.out.println("第"+(i+1)+"组平均分为："+avg[i]);
		}
		avgAll = avgSum/avg.length;
		System.out.println("班级中单组最高平均分为："+avgMax);
		System.out.println("班级中不及格人数为："+countAll);
		System.out.println("班级总平均分为："+avgAll);
		sc.close();
	}

}
