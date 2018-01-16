package cn.itcast.day07;

public class Dog {
//属性
private String color;//毛的颜色
private String breed;//品种
//构造方法
public Dog(){}
public Dog(String color,String breed){
	this.color = color;
	this.breed = breed;
}
//行为
public void eat(){
	System.out.println(color+"的"+breed+"正在啃骨头.....");
}
public void lookHome(){
	System.out.println(color+"的"+breed+"正在看家.....");
}
//setter和getter方法
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
}
