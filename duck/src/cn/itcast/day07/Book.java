package cn.itcast.day07;

public class Book {
//属性
private String bookId;//图书编号
private String name;//书名
private int price;//价格
//构造方法
public Book() {}
public Book(String bookId,String name,int price) {
	this.bookId = bookId;
	this.name = name;
	this.price = price;
}
//打印图书信息
public void getBookMessge(){
	System.out.println("图书编号："+bookId);
	System.out.println("书名："+name);
	System.out.println("价格："+price);
}
//setter和getter方法
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
