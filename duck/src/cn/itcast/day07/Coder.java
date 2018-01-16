package cn.itcast.day07;

public class Coder {
	private String name;//姓名 
	private String id;//工号
	private int salary;//工资
	//构造方法
	public Coder(){}
	public Coder(String name,String id,int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//work方法
	public void work(){
		System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写着代码......");
	}
	//setter和getter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
