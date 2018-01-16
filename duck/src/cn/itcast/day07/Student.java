package cn.itcast.day07;

public class Student {
private String studentId;//学员编号
private String name;//姓名
private char sex;//性别
private double high;//身高
private int age;//年龄
public Student(){}
public Student(String studentId,String name,char sex,double high,int age){
	this.studentId = studentId;
	this.name = name;
	this.sex = sex;
	this.high = high;
	this.age = age;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public double getHigh() {
	return high;
}
public void setHigh(double high) {
	this.high = high;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
