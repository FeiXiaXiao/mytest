package cn.itcast.day07;

public class Teacher {
	private String teacherId;//教师编号
	private String name;//姓名
	private char sex;//性别
	private int age;//年龄
	private String course;//科目
	public Teacher(){}
	public Teacher(String teacherId,String name,char sex,int age,String course){
		this.teacherId = teacherId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
