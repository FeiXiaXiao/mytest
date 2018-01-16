package cn.itcast.day07;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学员编号：");
		String studentId = sc.nextLine();
		System.out.println("请输入学员姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学员性别：");
		char sex = sc.nextLine().charAt(0);
		System.out.println("请输入学员身高：");
		double high = sc.nextDouble();
		System.out.println("请输入学员年龄：");
		int age = sc.nextInt();
		Student stu = new Student(studentId, name, sex, high, age);
		printStudent(stu);
	}
public static void printStudent(Student stu){
	System.out.println("-------------------------------");
	System.out.println("学员编号："+stu.getStudentId());
	System.out.println("姓名："+stu.getName());
	System.out.println("性别 ："+stu.getSex());
	System.out.println("身高："+stu.getHigh());
	System.out.println("年龄："+stu.getAge());
}
public static void printTeacher(Teacher t){
	System.out.println("-------------------------------");
	System.out.println("教师编号："+t.getTeacherId());
	System.out.println("姓名："+t.getName());
	System.out.println("性别："+t.getSex());
	System.out.println("年龄："+t.getAge());
	System.out.println("科目："+t.getCourse());
}
public static void printCourse(Course c){
	System.out.println("-------------------------------");
	System.out.println("课程编号："+c.getCourseId());
	System.out.println("名称："+c.getName());
	System.out.println("创建时间："+c.getTime());
	System.out.println("课程描述："+c.getDescription());
}
}
/*Teacher t1 = new Teacher("t001", "薛之谦", '男',26, "Java");
Teacher t2 = new Teacher("t002", "张碧晨", '男',24, "IOS");
Teacher t3 = new Teacher("t002", "张杰", '男',28, "Java");
Course c1 = new Course("s001", "Java", "2007-02-08", "Java学科，包含JavaSE和JavaEE");
Course c2 = new Course("s002", "IOS", "2007-02-09", "IOS系统开发");
printTeacher(t1);
printTeacher(t2);
printTeacher(t3);
printCourse(c1);
printCourse(c2);*/