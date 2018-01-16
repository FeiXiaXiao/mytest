package cn.itcast.day07;

public class Test01 {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.setName("zhouyong");
		m.setId("123");
		m.setSalary(15000);
		m.setBonus(6000);
		m.work();
		Coder c = new Coder("zhouyong","123",10000);
		c.work();
	}

}
