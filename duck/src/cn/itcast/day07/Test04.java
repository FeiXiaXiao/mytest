package cn.itcast.day07;

public class Test04 {

	public static void main(String[] args) {
		Book b1 = new Book("sd367433", "数学", 15);
		Book b2 = new Book("rf875093", "英语", 12);
		Book b3 = new Book("df587234", "设计模式", 22);
		Book temp = b1.getPrice() > b2.getPrice() ? b1 : b2 ;
		temp = temp.getPrice() > b3.getPrice() ? temp : b3 ;
		System.out.println("----以下是价格最高的图书的信息----");
		temp.getBookMessge();
	}

}
