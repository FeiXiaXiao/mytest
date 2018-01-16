package cn.itcast.day07;

public class Cat {
//属性
private String color;//毛的颜色
private String breed;//品种
//构造方法
public Cat() {}
public Cat(String color,String breed) {
	this.color = color;
	this.breed = breed;
}
//行为
public void eat() {
	System.out.println(color+"的"+breed+"正在吃鱼.....");
}
public void catchMouse() {
	System.out.println(color+"的"+breed+"正在逮老鼠....");
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
