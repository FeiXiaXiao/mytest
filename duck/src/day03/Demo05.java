package day03;
import java.util.Scanner;
public class Demo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num; 
		do{
			System.out.println("请输入一个1-5的数字");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("新建");
				break;
	        case 2:
	        	System.out.println("打开文件");
				break;
	        case 3:
	        	System.out.println("保存");
				break;
	        case 4:
	        	System.out.println("刷新");
				break;
	        case 5:
	        	System.out.println("退出");
	        	sc.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}while(true);
	}

}
