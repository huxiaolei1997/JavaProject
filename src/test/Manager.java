package test;

public class Manager extends Employee {
	// 在Manager类中，增加了一个用于存储奖金的域，以及对应的setter/getter方法
	private double bonus;
	
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		// 这里有一个getSalary()方法，Employee类中也有一个getSalary()方法，
		// 我们需要调用的是超类Employee的getSalary()的方法，而不是子类Manager的getSalary()
		// 方法，如果不在getSalary()前面加上super关键字，那么调用的是自身的getSalary()
		// 方法，所以这样会导致无限次调用自己，直到整个整个程序崩溃为止。
		double baseSalary = super.getSalary();
		// double baseSalary2 = getBonus();
		return baseSalary + bonus;
	}
	// 无参构造器
	public Manager() {
		
	}
	// 子类构造器
	public Manager(String name, double salary) {
		// 调用Employee中含有name, salary参数的构造器
		// 使用super实现第超类Employee类构造器的调用，
		// 并且使用super构造器的语句必须是子类构造器的第一条语句
		super(name, salary);
		this.bonus = 2000.0;
	}
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setBonus(6000);
		Manager manager2 = new Manager("Bob", 6000.0);
		System.out.println(manager2.getSalary() + " " + manager2.getBonus());
		System.out.println(manager.getSalary());
		
	}
}
