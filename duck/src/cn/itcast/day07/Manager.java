package cn.itcast.day07;

public class Manager {
	private String name;//姓名
	private String id;//工号
	private int salary;//工资
	private int bonus;//奖金
	//构造方法
	public Manager(){}
	public Manager(String name,String id,int salary,int bonus){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}
	//work方法
	public void work(){
		System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
	}
	//getter和setter方法
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
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
