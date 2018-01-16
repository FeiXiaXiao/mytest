package cn.itcast.day07;

public class Test02 {

	public static void main(String[] args) {
		Teacher2 t = new Teacher2("周志鹏", 30, "Java基础中面向对象");
		Student2 stu = new Student2("韩光", 18, "面向对象");
		t.eat();
		t.teach();
		stu.eat();
		stu.study();
	}

}
