package cn.itcast.day07;

public class Teacher2 {
//属性
private String name;//姓名
private int age;//年龄
private String content;//讲课内容
//构造方法
public Teacher2() {}
public Teacher2(String name,int age,String content) {
	this.name = name;
	this.age = age;
	this.content = content;
}
//行为
public void eat(){
	System.out.println("年龄为"+age+"的"+name+"老师正在吃饭....");
}
public void teach(){
	System.out.println("年龄为"+age+"的"+name+"老师正在亢奋的讲着"+content+"的知识........");
}
//getter和setter方法
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
}
